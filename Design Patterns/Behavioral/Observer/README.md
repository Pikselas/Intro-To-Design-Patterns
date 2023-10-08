## OBSERVER PATTERN

### Type: Behavioral

The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object (the subject) changes its state, all its dependents (observers) are notified and updated automatically. This pattern is used to establish communication and coordination between objects in a loosely coupled manner.

### Intent

- Define a dependency between objects so that when one object's state changes, all its dependents are notified and updated automatically.
- Encapsulate the core (or common) component, with one or more varying (optional or dependent) components.
- Promote loose coupling between subjects and observers.

### Structure

- **Subject**: Represents the core component or object that is being observed. It maintains a list of observers and notifies them of state changes.
- **Observer**: Defines an interface with methods to be implemented by concrete observers. Observers register themselves with subjects to receive updates.
- **Concrete Subject**: Implements the subject interface, maintains the state, and sends notifications to observers when the state changes.
- **Concrete Observer**: Implements the observer interface and defines specific actions to be taken when notified of a state change.

### Example

Consider a weather monitoring system where multiple displays need to be updated whenever weather conditions change. The Observer pattern can be applied to decouple the weather station (subject) from various weather displays (observers), allowing multiple displays to be easily added or removed.

### Benefits

- Loose Coupling: Subjects and observers are decoupled, promoting maintainability and scalability.
- Reusability: Observers can be reused in different subject instances.
- Flexibility: Easily add or remove observers without modifying the subject.
- Event Handling: Suitable for implementing event handling systems.

### When to Use

- When an object (subject) needs to notify multiple other objects (observers) about its state changes.
- When you want to establish a one-to-many relationship without making the subjects and observers tightly coupled.
- When you need to implement distributed event handling systems.