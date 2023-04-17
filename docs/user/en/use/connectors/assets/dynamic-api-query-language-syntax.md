### Syntax of query and constraints

<UsedTerms>
    <h4>Used terms</h4>
   <dl>
      <dt>implicit container</dt>
      <dd>
         A JSON object with all possible constraints defined as properties of that JSON object. All of these constraints are linked
         by logical [AND](https://en.wikipedia.org/wiki/Logical_conjunction) during processing.
      </dd>
   </dl>
</UsedTerms>

A [query](https://evitadb.io/documentation/query/basics#grammar), although custom for each [collection](https://evitadb.io/documentation/use/data-model#collection), has
a predefined set of rules/structure. It is basically a tree of individual constraints that ultimately define how
the queried data will be filtered, ordered and returned.
The basic constraints are the same as for the evitaDB [query language](https://evitadb.io/documentation/query/basics), but
they are written differently and not every single one may be available for your domain-specific data types. There are two main
reasons for this: the first one is that we want to help the user as much as possible
with code completion, so we use dynamically generated queries, the second one is due to the limitations of JSON
objects, mainly that JSON objects don't have names to reference them by.

Therefore, we have come up with the following syntax for constraints: each constraint consists of:

- `key` - basically a property of a parent JSON object
    - defines targeted property type
    - possible classifier of targeted data
    - a constraint name
- `value` - an object/value of that property
    - a scalar, an array or an object of arguments

Thanks to the API schemas, you don't have to worry about the details of each part of the syntax, because the API schema
will provide you only with those constraint that are valid.

<Note type="info">

<NoteTitle toggles="true">

##### Constraint key syntax in detail
</NoteTitle>

However, if you want to know more about the underlying syntax, read on.
Each key consists of 3 parts as mentioned above:

- a property type
- a classifier of data
- a constraint name

Only the constraint name is required for all the supported constraints, the rest depends on the context and the type of constraint.


The **property type** defines where the query processor will look for data to compare. There is a finite set of possible property types:

- `generic` - generic constraint that typically doesn't work with concrete data, it's more for containers like `and`, `or` or `not`
    - for simplicity, this property type is not written in the key of an actual constraint
- `entity` - handles properties directly accessible from an [entity](https://evitadb.io/documentation/use/data-model#entity) like the `primary key`
- `attribute` - can operate on an entity’s [attribute values](https://evitadb.io/documentation/use/data-model#attributes-unique-filterable-sortable-localized)
- `associatedData` - can operate on an entity’s [associated data values](https://evitadb.io/documentation/use/data-model#associated-data)
- `price` - can operate on entity [prices](https://evitadb.io/documentation/use/data-model#prices)
- `reference` - can operate on entity [references](https://evitadb.io/documentation/use/data-model#references)
- `hierarchy` - can operate on an entity’s [hierarchical data](https://evitadb.io/documentation/use/data-model#hierarchical-placement) (the hierarchical data may be even referenced from other entities)
- `facet` - can operate on referenced [facets](https://evitadb.io/documentation/use/data-model#references) to an entity

The **classifier** specifies exactly which data of the specified property type the constraint will operate on, if supported by the
property type. This is used e.g.
for attributes, where simply defining the property type doesn't tell us which attribute we want to compare. But without the property type
we don't know what the classifier represents. Therefore, we need *both* the property type and the classifier. But in cases like price comparison,
these constraints operate on single computed price so the evitaDB query processor implicitly knows which price we want to compare.


Finally, the **constraint name** actually defines what the query processor will do with the target data (i.e., how to compare the passed
data with data in the database).


All possible parts combinations are:
```
{constraint name} -> `and` (only usable for generic constraints)
{property type}{constraint name} -> `hierarchyWithinSelf` (in this case the classifier of used hierarchy is implicitly defined by rest of a query)
{property type}{classifier}{constraint name} -> `attributeCodeEquals` (key with all metadata)
```

</Note>

<Note type="example">

<NoteTitle toggles="true">

##### Example of a simple constraint
</NoteTitle>

A single constraint to return only entities that contain the `deviceType` attribute equal to the string `phone` would look like this:
```json
attributeDeviceTypeEquals: "phone"
```

</Note>

As mentioned above, JSON objects don't have names, and we can't define the constraint `key` in the body of a generic JSON object because
we would lose the strictly-typed query language backed by the API schema. Instead, the `key` is defined as a property
in the parent container (parent JSON object). Such containers contain all possible constraints in a given context.
These containers also contain some generic constraints such as `and`, `or` or `not` that accept inner containers to
combine constraints into trees of complex queries.

However, this complicates things when you need to pass child constraints into arguments of another constraint, because you
cannot simply pass the object representing the constraint, you need to wrap it in the above-mentioned container with all available constraints
to be able to define the constraint `key`. We call these necessary wrapping containers <Term name="implicit container">implicit containers</Term>,
and they can look like this:

```json
{
  and: ...,
  or: ...,
  attributeCodeEquals: ...,
  ...
}
```

Unfortunately, this means that you can define multiple constraints in one go in such a container, and we need to somehow define
relational logic between these child constraints. We chose to have all these <Term name="implicit container">implicit containers</Term>
define logical [`AND`](https://en.wikipedia.org/wiki/Logical_conjunction)
between passed child constraints, ultimately resulting in the `and` constraint under the hood.

Unfortunately, there is another small drawback if you need to define the same constraint multiple times in a single list
with different arguments.
In such a case, you need to wrap each such constraint into a separate <Term>implicit container</Term> and pass it like
array to the parent constraint, like so:

```json
or: [
  {
    attributeCodeStartsWith: "ipho"       
  },
  {
    attributeCodeStartsWith: "sams"
  }
]
```

This is mainly because JSON objects don't support multiple properties with the same name.

<Note type="example">

<NoteTitle toggles="true">

##### Example of a complex constraint
</NoteTitle>

A complex constraint tree with simple constraints, containers, and <Term name="implicit container">implicit containers</Term>
to return only entities with specific primary keys or other more complex constraints:
```json
filterBy: {
   or: [
      {
         entityPrimaryKeyInSet: [100, 200]
      },
      {
         attributeCodeStartsWith: "ipho",
         hierarchyCategoryWithin: {
            parentOf: 20
         },
         priceBetween: ["100.0", "250.0"]
      }
   ]
}
```

</Note>

<Note type="info">

<NoteTitle toggles="true">

##### Want to know more about the decisions behind the query language design?
</NoteTitle>

We have written a whole [blog post](https://evitadb.io/blog/02-designing-evita-query-language-for-graphql-api) about how we
approached the whole issue of representing the [evitaDB query language](https://evitadb.io/documentation/query/basics) in
the APIs, the possible syntax variants, limitations of JSON, etc.

</Note>