## Reference
- [Building a GraphQL Server with Spring Boot](https://www.pluralsight.com/guides/building-a-graphql-server-with-spring-boot)
    - https://github.com/eh3rrera/graphql-java-spring-boot-example
    
    
    
    
## What is GraphQL
GraphQL describes the data offered by an API through a schema that contains:
- Data types and relationships between them
- A set of operations:
    - Queries to get data
    - Mutations to create, update, and delete data

Query operations are also treated as types. 
They declare fields that represent the available operations. 
For example, you can define query operations to get all the songs and filter the songs by genre.
```
    type SongQueries {
       allSongs: [Song]
       filterSongsByGenre(genre: String!): [Song]
    }
    
    schema {
       query: SongQueries
    }
```

schemas are written in .graphqls files, which can be placed anywhere in the classpath.


## Java dependencies
graphql-java is a Java library that implements the GraphQL specification.
```
    <dependency>
        <groupId>com.graphql-java</groupId>
        <artifactId>graphql-java</artifactId>
        <version>6.0</version>
    </dependency>
```
graphql-java-tools parse GraphQL schemas instead of describing your types programmatically.
```
     <dependency>
         <groupId>com.graphql-java</groupId>
         <artifactId>graphql-java-tools</artifactId>
         <version>4.3.0</version>
     </dependency>
```
graphql-java-servlet implements a servlet that supports GET and POST requests for GraphQL queries
```
    <dependency>
        <groupId>com.graphql-java</groupId>
        <artifactId>graphql-java-servlet</artifactId>
        <version>4.7.0</version>
    </dependency>
```
graphql-spring-boot-starter will add and autoconfigure a GraphQL Servlet at /graphql and use a 
GraphQL schema library (like GraphQL Java Tools) to parse all the schema files found on the classpath
```
    <dependency>
      <groupId>com.graphql-java</groupId>
      <artifactId>graphql-spring-boot-starter</artifactId>
      <version>3.10.0</version>
    </dependency>
```
