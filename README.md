# TestExcellence is TestNg Framework for software testing.

This repository is a TestNG-based framework for testing REST API.

## Programming Language
* Java 23

## Build Tool
* Maven

## Project Structure
├── src
│ ├── main
│ │ └── java (reserved for project src code)
│ └── test
│ └── java (api pkg, AppBuilder pkg, pojo pkg, utils pkg, test pkg)
└── resources (config.properties, data.properties, log4j)
└── pom.xml

## Getting Started
* Setup Environment with java, Maven and Git
* Navigate to directory: cd //restful-booker.herokuapp.com
* Config.properties for changing the environments variables such as url, username, passwords etc.
* Run Test: mvn clean test
* (Optional) Change the test suite environment by passing system properties, for example:
mvn clean test -Denv=staging

## Dependencies
The following dependencies and plugins are used (specified in the Maven POM):
* Rest Assured (version 5.5.1)
* TestNG
* Lombok
* Jackson Databind
* Apache Log4j

## IDE Plugin
* IntelliJ TestNG plugin (for running and debugging tests within IntelliJ)

## Libraries Used
* Hamcrest matchers for expressive assertions in test methods.

## Help
* In this project, both header validations and response body validations are performed. Specifically:

### Header validations are done with RestAssured’s assertThat(), using:
* header()
* headers()

### Response body validations use various Hamcrest matchers:
* contains() → Checks for multiple elements’ values in the response body, in the same order (case sensitive).
* containsInAnyOrder() → Checks for multiple elements’ values in the response body, ignoring order (case sensitive).
* equalTo() → Checks that an element’s value in the response body is exactly what’s expected.
* empty() → Used with is(not(empty())) to verify that an element is not empty.

* These validations ensure that the API responses match expected values for both headers and body content.

## Programming Design Patterns and Utilities
* Builder Pattern: Utilized to create and manipulate objects (e.g., requests or data entities) in a fluent manner before sending them in tests.
* POJO Classes: Plain Old Java Objects, used to map JSON request and response payloads, providing cleaner and more maintainable code.
* Jackson Annotations: Various annotations (such as @JsonInclude, @JsonProperty) to control serialization and deserialization of JSON (including null or empty values).
* Property Loader: A singleton class responsible for loading properties from the config.properties and data.properties files.
* System Properties: Test suite environment (e.g., dev, qa, prod) can be changed by passing system properties at runtime (e.g., -Denv=qa)

## Framework Roadmap
1. Scalable and Extensible
2. Reusable REST Assured Specifications
3. Reusable REST Assured API
4. Separation of API Layer from Test Layer
5. Singleton Design Pattern
6. Builder Patterns
7. Reporting and Logging (Allure, Log4J)
8. Parallel Test Execution (TBD)
9. BDD Style
10. Separation of Scenario Files
