## STRATEGY PATTERN

### Type: Behavioral

The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one of them, and makes them interchangeable. It allows a client to choose and switch the appropriate algorithm at runtime without altering the client's code. This pattern promotes the principle of favoring composition over inheritance and enables better code organization and maintainability.

### Intent

- Define a family of algorithms, encapsulate each one, and make them interchangeable.
- Allow the client to choose the algorithm to be used at runtime.
- Decouple the client code from the specific implementations of algorithms.
- Promote code reusability and maintainability.

### Structure

- **Context**: Maintains a reference to the current strategy and delegates the work to the strategy object.
- **Strategy**: An interface or abstract class defining a set of methods (the algorithm) that concrete strategies must implement.
- **Concrete Strategies**: Concrete implementations of the strategy interface, each providing a different algorithm.

### Example

Suppose you have a payment processing system where you want to support multiple payment methods like Credit Card, PayPal, and Google Pay. The Strategy pattern can be used to implement each payment method as a separate strategy, allowing the client to choose the payment method dynamically.

### Benefits

- Flexibility: Easily add new algorithms (strategies) without modifying existing code.
- Reusability: Strategies can be reused in different contexts.
- Maintainability: Promotes clean and organized code.
- Testability: Each strategy can be tested independently.

### When to Use

- When you want to define a family of related algorithms and make them interchangeable.
- When you have a class with a behavior that can vary in multiple ways.
- When you want to avoid exposing complex, conditional statements in client code.
