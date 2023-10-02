## Singleton Pattern

### Type: Creational

#### Introduction:

The singleton pattern is a creational pattern whose objective is to create only one instance of a class and to provide only one global access point to that object. One commonly used example of such a class in java is Calendar, where you can't make an instance of that class. It also uses its own getInstance() method to get the object to be used.

#### Advantages:

1. Use the Singleton pattern when a class in program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program,
2. Use of the Singleton pattern gives stricter control over global variables.
3. The singleton object is initialized only when it’s requested for the first time.

#### Examples and Use Cases:

1. Used in global configuration. LogManager - there is a static LogManage.getLogManager() method and a single instance is used.
2. Java.Lang.Runtime - Every java application has a single instance of class Runtime that allows the application to interface with the environement in which the current runtime can be obtained from the getRuntime method.
3. Database connection objects.

