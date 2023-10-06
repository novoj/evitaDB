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

package io.evitadb.api.proxy.impl.reference;

import io.evitadb.api.exception.AttributeNotFoundException;
import io.evitadb.api.proxy.impl.ProxyUtils;
import io.evitadb.api.proxy.impl.ProxyUtils.OptionalProducingOperator;
import io.evitadb.api.proxy.impl.SealedEntityReferenceProxyState;
import io.evitadb.api.requestResponse.data.ReferenceContract;
import io.evitadb.api.requestResponse.data.annotation.Attribute;
import io.evitadb.api.requestResponse.data.annotation.AttributeRef;
import io.evitadb.api.requestResponse.schema.AttributeSchemaContract;
import io.evitadb.api.requestResponse.schema.EntitySchemaContract;
import io.evitadb.api.requestResponse.schema.ReferenceSchemaContract;
import io.evitadb.function.TriFunction;
import io.evitadb.utils.Assert;
import io.evitadb.utils.ClassUtils;
import io.evitadb.utils.CollectionUtils;
import io.evitadb.utils.NamingConvention;
import io.evitadb.utils.ReflectionLookup;
import one.edee.oss.proxycian.CurriedMethodContextInvocationHandler;
import one.edee.oss.proxycian.DirectMethodClassification;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static io.evitadb.api.proxy.impl.ProxyUtils.getResolvedTypes;
import static io.evitadb.api.proxy.impl.entity.GetAttributeMethodClassifier.createDefaultValueProvider;
import static io.evitadb.dataType.EvitaDataTypes.toTargetType;
import static java.util.Optional.ofNullable;

/**
 * Identifies methods that are used to get attributes from an reference and provides their implementation.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2023
 */
public class GetAttributeMethodClassifier extends DirectMethodClassification<Object, SealedEntityReferenceProxyState> {
	/**
	 * We may reuse singleton instance since advice is stateless.
	 */
	public static final GetAttributeMethodClassifier INSTANCE = new GetAttributeMethodClassifier();

	/**
	 * Retrieves appropriate attribute schema from the annotations on the method. If no Evita annotation is found
	 * it tries to match the attribute name by the name of the method.
	 */
	@Nullable
	private static AttributeSchemaContract getAttributeSchema(
		@Nonnull Method method,
		@Nonnull ReflectionLookup reflectionLookup,
		@Nonnull EntitySchemaContract entitySchema,
		@Nullable ReferenceSchemaContract referenceSchema
	) {
		final Attribute attributeInstance = reflectionLookup.getAnnotationInstanceForProperty(method, Attribute.class);
		final AttributeRef attributeRefInstance = reflectionLookup.getAnnotationInstanceForProperty(method, AttributeRef.class);
		final Function<String, AttributeSchemaContract> schemaLocator = attributeName -> referenceSchema.getAttribute(attributeName).orElseThrow(
			() -> new AttributeNotFoundException(attributeName, referenceSchema, entitySchema)
		);
		if (attributeInstance != null) {
			return schemaLocator.apply(attributeInstance.name());
		} else if (attributeRefInstance != null) {
			return schemaLocator.apply(attributeRefInstance.value());
		} else if (!reflectionLookup.hasAnnotationInSamePackage(method, Attribute.class) && ClassUtils.isAbstract(method)) {
			final Optional<String> attributeName = ReflectionLookup.getPropertyNameFromMethodNameIfPossible(method.getName());
			return attributeName
				.flatMap(attrName -> referenceSchema.getAttributeByName(attrName, NamingConvention.CAMEL_CASE))
				.orElse(null);
		} else {
			return null;
		}
	}

	/**
	 * Creates an implementation of the method returning an attribute as a requested type.
	 */
	@Nonnull
	private static CurriedMethodContextInvocationHandler<Object, SealedEntityReferenceProxyState> singleResult(
		@Nonnull String cleanAttributeName,
		@Nonnull Method method,
		@Nonnull Class<? extends Serializable> itemType,
		int indexedDecimalPlaces,
		@Nonnull BiFunction<ReferenceContract, String, Serializable> attributeExtractor,
		@Nonnull UnaryOperator<Serializable> defaultValueProvider,
		@Nonnull UnaryOperator<Object> resultWrapper
	) {
		Assert.isTrue(
			method.getParameterCount() == 0,
			"Non-localized attribute `" + cleanAttributeName + "` must not have a locale parameter!"
		);
		return (entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
			toTargetType(
				defaultValueProvider.apply(attributeExtractor.apply(theState.getReference(), cleanAttributeName)),
				itemType, indexedDecimalPlaces
			)
		);
	}

	/**
	 * Creates an implementation of the method returning an attribute of an array type wrapped into a set.
	 */
	@Nonnull
	private static CurriedMethodContextInvocationHandler<Object, SealedEntityReferenceProxyState> setOfResults(
		@Nonnull String cleanAttributeName,
		@Nonnull Method method,
		@Nonnull Class<? extends Serializable> itemType,
		int indexedDecimalPlaces,
		@Nonnull BiFunction<ReferenceContract, String, Serializable> attributeExtractor,
		@Nonnull UnaryOperator<Serializable> defaultValueProvider,
		@Nonnull UnaryOperator<Object> resultWrapper
	) {
		Assert.isTrue(
			method.getParameterCount() == 0,
			"Non-localized attribute `" + cleanAttributeName + "` must not have a locale parameter!"
		);
		return (entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
			ofNullable(
				toTargetType(
					defaultValueProvider.apply(attributeExtractor.apply(theState.getReference(), cleanAttributeName)),
					itemType, indexedDecimalPlaces
				)
			)
				.map(Object[].class::cast)
				.map(it -> {
					final Set<Object> result = CollectionUtils.createHashSet(it.length);
					result.addAll(Arrays.asList(it));
					return result;
				})
				.orElse(Collections.emptySet())
		);
	}

	/**
	 * Creates an implementation of the method returning an attribute of an array type wrapped into a list.
	 */
	@Nonnull
	private static CurriedMethodContextInvocationHandler<Object, SealedEntityReferenceProxyState> listOfResults(
		@Nonnull String cleanAttributeName,
		@Nonnull Method method,
		@Nonnull Class<? extends Serializable> itemType,
		int indexedDecimalPlaces,
		@Nonnull BiFunction<ReferenceContract, String, Serializable> attributeExtractor,
		@Nonnull UnaryOperator<Serializable> defaultValueProvider,
		@Nonnull UnaryOperator<Object> resultWrapper
	) {
		Assert.isTrue(
			method.getParameterCount() == 0,
			"Non-localized attribute `" + cleanAttributeName + "` must not have a locale parameter!"
		);
		return (entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
			ofNullable(
				toTargetType(
					defaultValueProvider.apply(attributeExtractor.apply(theState.getReference(), cleanAttributeName)),
					itemType, indexedDecimalPlaces
				)
			)
				.map(it -> List.of((Object[]) it))
				.orElse(Collections.emptyList())
		);
	}

	/**
	 * Creates an implementation of the method returning an attribute as a requested type.
	 */
	@Nonnull
	private static CurriedMethodContextInvocationHandler<Object, SealedEntityReferenceProxyState> singleLocalizedResult(
		@Nonnull String cleanAttributeName,
		@Nonnull Method method,
		@Nonnull Class<? extends Serializable> itemType,
		int indexedDecimalPlaces,
		@Nonnull BiFunction<ReferenceContract, String, Serializable> attributeExtractor,
		@Nonnull TriFunction<ReferenceContract, String, Locale, Serializable> localizedAttributeExtractor,
		@Nonnull UnaryOperator<Serializable> defaultValueProvider,
		@Nonnull UnaryOperator<Object> resultWrapper
	) {
		return method.getParameterCount() == 0 ?
			(entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
				toTargetType(
					defaultValueProvider.apply(attributeExtractor.apply(theState.getReference(), cleanAttributeName)),
					itemType, indexedDecimalPlaces
				)
			) :
			(entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
				toTargetType(
					defaultValueProvider.apply(
						localizedAttributeExtractor.apply(theState.getReference(), cleanAttributeName, (Locale) args[0])
					),
					itemType, indexedDecimalPlaces
				)
			);
	}

	/**
	 * Creates an implementation of the method returning an attribute of an array type wrapped into a set.
	 */
	@Nonnull
	private static CurriedMethodContextInvocationHandler<Object, SealedEntityReferenceProxyState> setOfLocalizedResults(
		@Nonnull String cleanAttributeName,
		@Nonnull Method method,
		@Nonnull Class<? extends Serializable> itemType,
		int indexedDecimalPlaces,
		@Nonnull BiFunction<ReferenceContract, String, Serializable> attributeExtractor,
		@Nonnull TriFunction<ReferenceContract, String, Locale, Serializable> localizedAttributeExtractor,
		@Nonnull UnaryOperator<Serializable> defaultValueProvider,
		@Nonnull UnaryOperator<Object> resultWrapper
	) {
		return method.getParameterCount() == 0 ?
			(entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
				ofNullable(
					toTargetType(
						defaultValueProvider.apply(attributeExtractor.apply(theState.getReference(), cleanAttributeName)),
						itemType, indexedDecimalPlaces
					)
				)
					.map(Object[].class::cast)
					.map(it -> {
						final Set<Object> result = CollectionUtils.createHashSet(it.length);
						result.addAll(Arrays.asList(it));
						return result;
					})
					.orElse(Collections.emptySet())
			) :
			(entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
				ofNullable(
					toTargetType(
						defaultValueProvider.apply(
							localizedAttributeExtractor.apply(
								theState.getReference(), cleanAttributeName, (Locale) args[0]
							)
						),
						itemType, indexedDecimalPlaces
					)
				)
					.map(Object[].class::cast)
					.map(it -> {
						final Set<Object> result = CollectionUtils.createHashSet(it.length);
						result.addAll(Arrays.asList(it));
						return result;
					})
					.orElse(Collections.emptySet())
			);
	}

	/**
	 * Creates an implementation of the method returning an attribute of an array type wrapped into a list.
	 */
	@Nonnull
	private static CurriedMethodContextInvocationHandler<Object, SealedEntityReferenceProxyState> listOfLocalizedResults(
		@Nonnull String cleanAttributeName,
		@Nonnull Method method,
		@Nonnull Class<? extends Serializable> itemType,
		int indexedDecimalPlaces,
		@Nonnull BiFunction<ReferenceContract, String, Serializable> attributeExtractor,
		@Nonnull TriFunction<ReferenceContract, String, Locale, Serializable> localizedAttributeExtractor,
		@Nonnull UnaryOperator<Serializable> defaultValueProvider,
		@Nonnull UnaryOperator<Object> resultWrapper
	) {
		return method.getParameterCount() == 0 ?
			(entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
				ofNullable(
					toTargetType(
						defaultValueProvider.apply(attributeExtractor.apply(theState.getReference(), cleanAttributeName)),
						itemType, indexedDecimalPlaces
					)
				)
					.map(it -> List.of((Object[]) it))
					.orElse(Collections.emptyList())
			) :
			(entityClassifier, theMethod, args, theState, invokeSuper) -> resultWrapper.apply(
				ofNullable(
					toTargetType(
						defaultValueProvider.apply(
							localizedAttributeExtractor.apply(
								theState.getReference(), cleanAttributeName, (Locale) args[0]
							)
						),
						itemType, indexedDecimalPlaces
					)
				)
					.map(it -> List.of((Object[]) it))
					.orElse(Collections.emptyList())
			);
	}

	public GetAttributeMethodClassifier() {
		super(
			"getAttribute",
			(method, proxyState) -> {
				// We only want to handle non-abstract methods with no parameters or a single Locale parameter
				if (
					!ClassUtils.isAbstractOrDefault(method) ||
						method.getParameterCount() > 1 ||
						(method.getParameterCount() == 1 && !method.getParameterTypes()[0].equals(Locale.class))
				) {
					return null;
				}
				// now we need to identify attribute schema that is being requested
				final AttributeSchemaContract attributeSchema = getAttributeSchema(
					method, proxyState.getReflectionLookup(),
					proxyState.getEntitySchema(),
					proxyState.getReferenceSchema()
				);
				// if not found, this method is not classified by this implementation
				if (attributeSchema == null) {
					return null;
				} else {
					// finally provide implementation that will retrieve the attribute from the entity
					final String cleanAttributeName = attributeSchema.getName();
					final int indexedDecimalPlaces = attributeSchema.getIndexedDecimalPlaces();

					// now we need to identify the return type
					@SuppressWarnings("rawtypes") final Class returnType = method.getReturnType();
					final Class<?>[] resolvedTypes = getResolvedTypes(method, proxyState.getProxyClass());
					@SuppressWarnings("unchecked") final UnaryOperator<Serializable> defaultValueProvider = createDefaultValueProvider(attributeSchema, returnType);
					final UnaryOperator<Object> resultWrapper;
					final int index = Optional.class.isAssignableFrom(resolvedTypes[0]) ? 1 : 0;

					@SuppressWarnings("rawtypes") final Class collectionType;
					@SuppressWarnings("rawtypes") final Class itemType;
					if (Collection.class.equals(resolvedTypes[index]) || List.class.isAssignableFrom(resolvedTypes[index]) || Set.class.isAssignableFrom(resolvedTypes[index])) {
						collectionType = resolvedTypes[index];
						itemType = Array.newInstance(resolvedTypes.length > index + 1 ? resolvedTypes[index + 1] : Object.class, 0).getClass();
						resultWrapper = ProxyUtils.createOptionalWrapper(Optional.class.isAssignableFrom(resolvedTypes[0]) ? Optional.class : null);
					} else if (resolvedTypes[index].isArray()) {
						collectionType = null;
						itemType = resolvedTypes[index];
						resultWrapper = ProxyUtils.createOptionalWrapper(Optional.class.isAssignableFrom(resolvedTypes[0]) ? Optional.class : null);
					} else {
						collectionType = null;
						if (OptionalInt.class.isAssignableFrom(resolvedTypes[0])) {
							itemType = int.class;
							resultWrapper = ProxyUtils.createOptionalWrapper(itemType);
						} else if (OptionalLong.class.isAssignableFrom(resolvedTypes[0])) {
							itemType = long.class;
							resultWrapper = ProxyUtils.createOptionalWrapper(itemType);
						} else if (Optional.class.isAssignableFrom(resolvedTypes[0])) {
							itemType = resolvedTypes[index];
							resultWrapper = ProxyUtils.createOptionalWrapper(itemType);
						} else {
							itemType = resolvedTypes[index];
							resultWrapper = ProxyUtils.createOptionalWrapper(null);
						}
					}

					final BiFunction<ReferenceContract, String, Serializable> attributeExtractor =
						resultWrapper instanceof OptionalProducingOperator ?
							(reference, attributeName) -> reference.attributeAvailable(attributeName) ? reference.getAttribute(attributeName) : null :
							ReferenceContract::getAttribute;

					if (attributeSchema.isLocalized()) {

						final TriFunction<ReferenceContract, String, Locale, Serializable> localizedAttributeExtractor =
							resultWrapper instanceof OptionalProducingOperator ?
								(reference, attributeName, locale) -> reference.attributeAvailable(attributeName, locale) ? reference.getAttribute(attributeName, locale) : null :
								ReferenceContract::getAttribute;

						if (collectionType != null && Set.class.isAssignableFrom(collectionType)) {
							//noinspection unchecked
							return setOfLocalizedResults(
								cleanAttributeName, method, itemType, indexedDecimalPlaces,
								attributeExtractor, localizedAttributeExtractor, defaultValueProvider, resultWrapper
							);
						} else if (collectionType != null) {
							//noinspection unchecked
							return listOfLocalizedResults(
								cleanAttributeName, method, itemType, indexedDecimalPlaces,
								attributeExtractor, localizedAttributeExtractor, defaultValueProvider, resultWrapper
							);
						} else {
							//noinspection unchecked
							return singleLocalizedResult(
								cleanAttributeName, method, itemType, indexedDecimalPlaces,
								attributeExtractor, localizedAttributeExtractor, defaultValueProvider, resultWrapper
							);
						}
					} else {
						Assert.isTrue(
							method.getParameterCount() == 0,
							"Non-localized attribute `" + attributeSchema.getName() + "` of reference `" + proxyState.getReferenceSchema().getName() + "` must not have a locale parameter!"
						);
						if (collectionType != null && Set.class.isAssignableFrom(collectionType)) {
							//noinspection unchecked
							return setOfResults(
								cleanAttributeName, method, itemType, indexedDecimalPlaces,
								attributeExtractor, defaultValueProvider, resultWrapper
							);
						} else if (collectionType != null) {
							//noinspection unchecked
							return listOfResults(
								cleanAttributeName, method, itemType, indexedDecimalPlaces,
								attributeExtractor, defaultValueProvider, resultWrapper
							);
						} else {
							//noinspection unchecked
							return singleResult(
								cleanAttributeName, method, itemType, indexedDecimalPlaces,
								attributeExtractor, defaultValueProvider, resultWrapper
							);
						}
					}
				}
			}
		);
	}

}
