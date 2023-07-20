/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023
 *
 *   Licensed under the Business Source License, Version 1.1 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.core.query.filter.translator.price.alternative;

import io.evitadb.api.query.require.EntityFetch;
import io.evitadb.api.query.require.PriceContent;
import io.evitadb.api.query.require.PriceContentMode;
import io.evitadb.api.query.require.QueryPriceMode;
import io.evitadb.api.requestResponse.data.PriceContract;
import io.evitadb.api.requestResponse.data.SealedEntity;
import io.evitadb.api.requestResponse.data.structure.EntityDecorator;
import io.evitadb.api.requestResponse.schema.EntitySchemaContract;
import io.evitadb.core.query.QueryContext;
import io.evitadb.core.query.algebra.prefetch.EntityToBitmapFilter;
import io.evitadb.core.query.algebra.price.FilteredPriceRecordAccessor;
import io.evitadb.core.query.algebra.price.filteredPriceRecords.FilteredPriceRecords;
import io.evitadb.core.query.algebra.price.filteredPriceRecords.FilteredPriceRecords.SortingForm;
import io.evitadb.core.query.algebra.price.filteredPriceRecords.ResolvedFilteredPriceRecords;
import io.evitadb.core.query.filter.FilterByVisitor;
import io.evitadb.function.QuadriFunction;
import io.evitadb.index.array.CompositeObjectArray;
import io.evitadb.index.bitmap.BaseBitmap;
import io.evitadb.index.bitmap.Bitmap;
import io.evitadb.index.bitmap.EmptyBitmap;
import io.evitadb.index.price.model.priceRecord.CumulatedVirtualPriceRecord;
import io.evitadb.index.price.model.priceRecord.PriceRecordContract;
import io.evitadb.utils.NumberUtils;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * Implementation of {@link EntityToBitmapFilter} that verifies that the entity has the "selling price" available.
 * The proper "selling price" is derived from the {@link QueryContext} automatically by specifying
 * {@link PriceContentMode#RESPECTING_FILTER} which in turn retrieves all basic constraints such as price list / currency
 * from the {@link io.evitadb.api.requestResponse.EvitaRequest}. Only the price between must be handled locally.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2022
 */
public class SellingPriceAvailableBitmapFilter implements EntityToBitmapFilter, FilteredPriceRecordAccessor {
	private static final EntityFetch ENTITY_REQUIRE = new EntityFetch(new PriceContent(PriceContentMode.RESPECTING_FILTER));

	/**
	 * Internal function that converts {@link PriceContract} from the entity to the {@link PriceRecordContract} that is
	 * used in filtration logic.
	 */
	private final QuadriFunction<Integer, Integer, QueryPriceMode, PriceContract, PriceRecordContract> converter;
	/**
	 * Contains the predicate that must be fulfilled in order selling price is accepted by the filter.
	 */
	private final Predicate<PriceContract> filter;
	/**
	 * Contains array of price records that links to the price ids produced by {@link #filter(FilterByVisitor)}
	 * method. This object is available once the {@link #filter(FilterByVisitor)}  method has been called.
	 */
	private FilteredPriceRecords filteredPriceRecords;

	public SellingPriceAvailableBitmapFilter() {
		this(priceContract -> true);
	}

	public SellingPriceAvailableBitmapFilter(@Nonnull Predicate<PriceContract> filter) {
		this.converter = (entityPrimaryKey, indexedPricePlaces, priceQueryMode, priceContract) -> new CumulatedVirtualPriceRecord(
			entityPrimaryKey,
			priceQueryMode == QueryPriceMode.WITH_TAX ?
				NumberUtils.convertToInt(priceContract.priceWithTax(), indexedPricePlaces) :
				NumberUtils.convertToInt(priceContract.priceWithoutTax(), indexedPricePlaces),
			priceQueryMode
		);
		this.filter = filter;
	}

	@Nonnull
	@Override
	public EntityFetch getEntityRequire() {
		return ENTITY_REQUIRE;
	}

	@Nonnull
	@Override
	public FilteredPriceRecords getFilteredPriceRecords() {
		return filteredPriceRecords;
	}

	@Nonnull
	@Override
	public Bitmap filter(@Nonnull FilterByVisitor filterByVisitor) {
		final CompositeObjectArray<PriceRecordContract> theFilteredPriceRecords = new CompositeObjectArray<>(PriceRecordContract.class);
		final QueryPriceMode queryPriceMode = filterByVisitor.getQueryPriceMode();
		final BaseBitmap result = new BaseBitmap();
		final AtomicInteger indexedPricePlaces = new AtomicInteger();
		String entityType = null;
		final List<EntityDecorator> entities = filterByVisitor.getPrefetchedEntities();
		if (entities == null) {
			return EmptyBitmap.INSTANCE;
		} else {
			// iterate over all entities
			for (SealedEntity entity : entities) {
				final EntityDecorator entityDecorator = (EntityDecorator) entity;
			/* we can be sure entities are sorted by type because:
			   1. all entities share the same type
			   2. or entities are fetched via {@link QueryContext#prefetchEntities(EntityReference[], EntityContentRequire[])}
			      that fetches them by entity type in bulk
			*/
				final EntitySchemaContract entitySchema = entity.getSchema();
				if (!Objects.equals(entityType, entitySchema.getName())) {
					entityType = entitySchema.getName();
					indexedPricePlaces.set(entitySchema.getIndexedPricePlaces());
				}
				final int primaryKey = filterByVisitor.translateEntity(entity);
				if (entityDecorator.isPriceForSaleContextAvailable()) {
					// check whether they have valid selling price (applying filter on price lists and currency)
					entityDecorator.getPriceForSale(filter)
						// and if there is still selling price add it to the output result
						.ifPresent(it -> {
							theFilteredPriceRecords.add(converter.apply(primaryKey, indexedPricePlaces.get(), queryPriceMode, it));
							result.add(primaryKey);
						});
				} else {
					if (entity.getAllPricesForSale().stream().anyMatch(filter)) {
						result.add(primaryKey);
					}
				}

			}
			// memoize valid selling prices for sorting purposes
			this.filteredPriceRecords = new ResolvedFilteredPriceRecords(theFilteredPriceRecords.toArray(), SortingForm.NOT_SORTED);
			// return entity ids having selling prices
			return result;
		}
	}

}
