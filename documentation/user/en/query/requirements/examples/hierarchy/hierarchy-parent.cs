EvitaResponse<SealedEntity> entities = evita.QueryCatalog(
	"evita",
	session => session.QuerySealedEntity(
        Query(
        	Collection("Product"),
        	FilterBy(
        		HierarchyWithin(
        			"categories",
        			AttributeEquals("code", "audio")
        		)
        	),
        	Require(
        		HierarchyOfReference(
        			"categories",
        			RemoveEmpty,
        			Parents(
        				"parent",
        				EntityFetch(
        					AttributeContent("code")
        				),
        				StopAt(
        					Distance(1)
        				),
        				Statistics(WithoutUserFilter, ChildrenCount, QueriedEntityCount)
        			)
        		)
        	)
        )
	)
);