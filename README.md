# This is part of SFG Beer Works 
- a small microservices training application by John Thompson - Spring Framework Guru

# Resources used
- Intellij IDE
- Lombok - annotation processor
    - Lombok annotations - generates constructors, getters, setters, etc. at runtime
    - must enable Annotation Processors in Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors

- MapStruct

- Axis TCP Mon - monitor plugin
    - useful for seeing what is actually going across the wire between a client and server in HTTP 
        - and not what the browser, application or server is telling you is going across
    - tells you if hidden tokens or headers, useful for debugging when nothing is showing up in standard tools
    - https://plugins.jetbrains.com/plugin/154-axis-tcp-monitor-plugin
    - old but still works
    
# Notes

### MapStruct
- First release in 2017
- Founded by Gunnar Morling, who is the spec lead for Hibernate on Bean Validation 2.0
- Current release 1.3.0.Final - Feb 2019
- MapStruct is a code generator for mapping between Java bean types
    -ie interface/repository layer and converting those to an entity, and back and forth
    - ie BeerDto -> Beer (Entity, POJO)
    - Spring Data Rest will expose your entire entities out to the web
    - Practically speaking, larger Enterprise projects RARELY expose their database objects to API consumers or to the web tier
    - Typically the API consumer is going to have different needs and demands than what the persistence layer has
    - MapStruct allows developers an easy way to keep web tier and data tier separated with easy conversion and not a lot of code
- Like Project Lombok, MapStruct hooks into annotation processing to generate code
- Unlike Project Lombok, Mapstruct will generate source code

- Mapstruct follows a convention over configuration approach
- Mapstruct works by you declaring an interface, MapStruct generates the implementation
- Properties of the same name / same type will automatically get mapped
    - huge time saver
- Different property names are configured via annotation properties
- Different types can be referenced with additional mapper implementations
- If present, MapStruct will use builders

- Mappers can reference other mappers
    - ie an Order Mapper can use the Order Line Mapper
- Can be configured to annotate generated mappers as Spring Components
    - Useful for Dependency Injection with Spring
- Can use default methods on interfaces
- Complex mappings can be done via abstract classes


### Java Bean Validation & Hibernate Validator

- JSR 303
    - Introduced Java Bean Validation (Version 1.0)
        - Set of annotations used to validate Java Bean properties
    - Approved on November 16, 2009
    - Part of JEE v6+
    - JSR 303 supported by Spring since version 3
    - Primary focus was to define annotations for data validation
        - Largely field level properties
        
- JSR 349 Bean Validation 1.1
    - Released on April 10, 2013
        - JEE v7, Spring Framework 4
    - Builds upon 1.0 specification
    - Expanded to method level validation
        - To validate input parameters
    - Includes dependency injection for bean validation components
    
- JSR 380 - Bean Validation 2.0
    - Released August 2017
    - Added to Spring Framework 5.0 RC2
    - Available in Spring Boot 2.0.0+
    - Uses Hibernate Validator 6.0+ (Implementation of Bean Validation 2.0)
    - Primary goal of Bean Validation 2.0 is Java 8 language features
    - Added ~11 new built in validation annotations
    - This project uses Bean Validation 2.0
    
- Built in Constraint Defintions

    - **@Null** - checks if value is null
    - **@NotNull** - checks if value is not null
    - **@AssertTrue** - checks if value is true
    - **@AssertFalse** - checks if value is false
    - **@Min** - checks if value is equal or higher than
    - **@Max** - checks if value is equal or lower than
    - **@DecimalMin** - checks if value is larger than
    - **@DecimalMax** - checks if value is smaller than
    - **@Negative** - checks if value is less than zero. Zero invalid.
    - **@NegativeOrZero** - checks if value is equal to or less than zero
    - **@Positive** - checks if value is greater than zero. Zero invalid.
    - **@PositiveOrZero** - checks if value is equal to or greater than zero
    - **@Size** - checks if string collection is between a min and max
    - **@Digits** - checks if value contains integer digits and fraction digits
    - **@Past** - checks if date is past
    - **@PastOrPresent** - checks if date is past or present
    - **@Future** - checks if date is future
    - **@FutureOrPresent** - checks if date is future or present
    - **@Pattern** - checks if value against a RegEx pattern
    - **@NotEmpty** - checks if value is null or empty(whitespace characters or empty collection)
    - **@NotBlank** - checks if string is not null or not whitespace characters
    - **@Email** - checks if string value is valid email address
    
- Hibernate Validator Constraints

    - **@ScriptAssert** - Class level annotation, checks class against script
    - **@CreditCardNumber** - verifies value is a valid credit card number
    - **@Currency** - valid currency amount
    - **@DurationMax** - checks if duration is less than given value
    - **@DurationMin** - checks if duration is greater than given value
    - **@EAN** - valid EAN barcode (Europe)
    - **@ISBN** - valid ISBN value
    - **@Length** - String length between given min and max
    - **@CodePointLength** - Validates that code point length of the annotated character sequence is between min and max inclusive
    - **@LuhnCheck** - Luhn check sum
    - **@Mod10Check** - Mod 10 checksum
    - **@Mod11Check** - Mod 11 checksum
    - **@Range** - checks if number is between given min and max (inclusive)
    - **@SafeHtml** - checks for safe HTML
    - **@UniqueElements** - checks if collection has all unique elements
    - **@Url** - checks for valid URL
    
- Hibernate Validator Country Constraints (examples)

    - **@CNPJ** - Brazilian Corporate Tax Payer Registry Number
    - **@CPF** - Brazilian Individual Tax Payer Registry Number
    - **@TituloEleitoral** - Brazilian Voter ID
    - **@NIP** - Polish VAR ID
    - **@PESEL** - Polish National Validation Number
    - **@REGON** - Polish Taxpayer ID
    
- Bean Validation Usage
    - Hibernate Validator 6+ is only implementation of Bean Validation 2.0
        - as of 2019
    - Consult Hibernate documentation for more details
    - Hibernate is likely to add additional predefined validators
    - Official documentation covers how to define custom validators
