evita.queryCatalog(
	"evita",
	session -> {
		final EvitaResponse<SealedEntity> entities = session.query(
			query(
				collection("Product"),
				filterBy(
					and(
						entityLocaleEquals(Locale.US),
						priceInPriceLists("basic"),
						priceInCurrency(Currency.getInstance("CZK"))
					)
				),
				require(
					entityFetch(
						attributeContent("name")
					)
				)
			),
			SealedEntity.class
		);
		// we need to enrich first found entity only
		// the entity will be enriched with:
		//   - rest of the attributes
		//   - all associated data
		//   - prices (`basic` + `reference`) will be fetched
		//   - reference `brand`
		final SealedEntity enrichedEntity = session.enrichEntity(
			entities.getRecordData().get(0),
			attributeContent(),
			associatedDataContent(),
			priceContent("reference"),
			referenceContent("brand")
		);
		return entities;
	}
);