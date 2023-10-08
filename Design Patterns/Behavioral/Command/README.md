## COMMAND PATTERN

### Type: Behavioral

The Command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. This information includes the method name, the object that owns the method, and values for the method parameters.

### Intent

- Encapsulate a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- Provide support for undoable operations.
- Decouple the sender and receiver of a request.

### Structure

- **Command**: Declares an interface for executing an operation. It usually includes an `execute()` method that encapsulates the action to be performed.
- **ConcreteCommand**: Implements the `Command` interface and holds a reference to a receiver object. It defines the binding between the action and the receiver.
- **Receiver**: Represents the object that performs the actual action when the `execute()` method of the command is called. It knows how to carry out the request.
- **Invoker**: Requests the command to carry out the action. It holds a reference to the command object and triggers the execution of the command when needed.
- **Client**: Creates the command objects, associates them with the receiver, and then associates them with the invoker.

### Example

Consider a remote control that can control various electronic devices like lights, fans, and stereo systems. Each button on the remote control represents a specific command, such as turning on the lights, turning off the fan, or increasing the volume of the stereo. The Command pattern can be applied to encapsulate these commands as objects, allowing you to parameterize the remote control with various actions.

### Benefits

- Decouples the sender and receiver.
- Allows for the addition of new commands without changing existing code.
- Supports undoable operations.
- Facilitates the implementation of composite commands.

### When to Use

- When you want to parameterize objects with operations.
- When you want to queue, schedule, or log requests.
- When you want to support undoable operations.