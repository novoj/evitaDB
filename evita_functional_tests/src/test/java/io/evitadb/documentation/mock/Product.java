package io.evitadb.documentation.mock;

import io.evitadb.api.requestResponse.data.PriceContract;
import io.evitadb.api.requestResponse.data.SealedInstance;
import io.evitadb.api.requestResponse.data.annotation.AssociatedData;
import io.evitadb.api.requestResponse.data.annotation.Attribute;
import io.evitadb.api.requestResponse.data.annotation.Entity;
import io.evitadb.api.requestResponse.data.annotation.ParentEntity;
import io.evitadb.api.requestResponse.data.annotation.PriceForSale;
import io.evitadb.api.requestResponse.data.annotation.PrimaryKey;
import io.evitadb.api.requestResponse.data.annotation.Reference;
import io.evitadb.api.requestResponse.data.annotation.ReferencedEntity;
import io.evitadb.api.requestResponse.data.annotation.ReferencedEntityGroup;
import io.evitadb.api.requestResponse.schema.EvolutionMode;
import io.evitadb.api.requestResponse.schema.dto.AttributeUniquenessType;

import javax.annotation.Nonnull;
import java.io.Serializable;

/**
 * We have these classes because of `java.md` documentation file. Unfortunately, there is problem with Proxycian and
 * ByteBuddy in the JShell REPL classloader and we need to declare the main interfaces on standard classpath.
 */
@Entity(
	allowedEvolution = {
		EvolutionMode.ADDING_LOCALES,
		EvolutionMode.ADDING_CURRENCIES
	}
)
public interface Product extends SealedInstance<Product, ProductEditor>, Serializable {

	@PrimaryKey(autoGenerate = false)
	int getId();

	@Attribute(
		name = "code",
		description = "Unique code of the product.",
		unique = AttributeUniquenessType.UNIQUE_WITHIN_COLLECTION
	)
	@Nonnull
	String getCode();

	@Attribute(localized = true)
	String getName();

	@Attribute
	String getEAN();

	@Attribute(
		name = "manufacturedBefore",
		description = "How many years ago the product was manufactured.",
		deprecated = "This attribute is obsolete.",
		filterable = true
	)
	default int[] getYears() {
		// the default implementation defines default value
		return new int[] {1978,2005,2020};
	}

	@AssociatedData
	ReferencedFiles getReferencedFiles();

	@ParentEntity
	int getParentEntity();

	@PriceForSale
	PriceContract getSellingPrice();

	@Reference(indexed = true, managed = false, groupEntityManaged = false)
	Brand getMarketingBrand();

	@Reference(managed = false, groupEntityManaged = false)
	Brand[] getLicensingBrands();

	record ReferencedFiles(@Nonnull int... fileId) implements Serializable {}

	interface Brand extends Serializable {

		@ReferencedEntity
		int getBrand();

		@ReferencedEntityGroup
		int getBrandGroup();

		@Attribute
		String getMarket();

	}

}