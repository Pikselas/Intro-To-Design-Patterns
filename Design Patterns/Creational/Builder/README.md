## Builder Pattern

### Type: Creational

#### Introduction:

The Builder pattern was introduced to address some of the issues associated with factory and abstract factory design patterns, particularly when dealing with objects that have numerous attributes.

The Builder pattern encapsulates or hides the process of building a complex object and separates the representation of the object from its construction.

#### Advantages:

1. The construction or creation code is extracted from the object's own class and moved to separate objects called Builders. This separation allows us to create different representations using the same construction process.
2. To solve the telescoping constructor anti-pattern issue, instead of using numerous constructors, the Builder pattern uses a builder, which is another object that receives each initialization parameter step by step and then returns the resulting constructed object all at once.
3. We can reuse the same construction code when building various representations of products.
4. Single Responsibility Principle: We can isolate complex construction code from the business logic of the product.

#### Examples and Use Cases:

1. `StringBuilder` class in Java.
2. Database query building.
3. URL builder.
4. For constructing immutable objects.