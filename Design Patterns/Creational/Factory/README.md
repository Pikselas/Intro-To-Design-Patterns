## FACTORY PATTERN

### Type: Creational

The Factory pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It defines a separate method for creating objects and subclasses can then override this method to change the class of objects that will be created. This pattern promotes loose coupling by eliminating the need for the client code to know which concrete class it needs to instantiate. Instead, the client code only interacts with the abstract interface, which is implemented by the concrete classes.