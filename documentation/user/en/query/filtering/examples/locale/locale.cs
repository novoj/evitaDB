EvitaResponse<SealedEntity> entities = evita.QueryCatalog(
	"evita",
	session => session.QuerySealedEntity(
        Query(
        	Collection("Product"),
        	FilterBy(
        		HierarchyWithin(
        			"categories",
        			AttributeEquals("code", "vouchers-for-shareholders")
        		),
        		EntityLocaleEquals(CultureInfo.GetCultureInfo("en"))
        	),
        	Require(
        		EntityFetch(
        			AttributeContent("code", "name")
        		)
        	)
        )
	)
);