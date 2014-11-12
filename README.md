spring-data-mongodb-mapping-test
================================

This project is just show a bug in Spring Data MongoDB instantiating the classes loading data from the database. (https://jira.spring.io/browse/DATACMNS-590)

This will produce an exception trying to instantatiate GenericItemType (which is abstract) and it should instantiate an ItemType instance.

To reproduce this error, just do a 'mvn test', this should run a mongodb server at a random free port (thanks to https://github.com/jirutka/embedmongo-spring), and run the test.
