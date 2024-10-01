# Usage of Design Patterns

This project demonstrates the use of several design patterns through practical use cases. Each pattern is implemented in Java and illustrates how it may be used to address specific design issues.

## Design Patterns and Use Cases

### 1. Behavioral Design Patterns

#### Iterator Pattern
**Use Case**: *Moving Through songs in a Playlist*  
This pattern facilitates the management of a collection of objects, allowing for the addition and iteration of items in a straightforward manner. It encapsulates the iteration logic, enabling users to traverse the collection without exposing its internal structure.

#### Mediator Pattern
**Use Case**: *Chat Application*  
This pattern serves as a mediator that enables communication between various components in a system. It allows different entities to interact without needing to directly reference each other, simplifying the communication flow.

### 2. Creational Design Patterns

#### Singleton Pattern
**Use Case**: *Database Connection Management*  
This pattern ensures that a class has only one instance and provides a global point of access to it. It is particularly useful for managing resources efficiently and preventing conflicts in applications that require centralized control.

#### Builder Pattern
**Use Case**: *Meal Preparation*  
This pattern allows for the step-by-step construction of complex objects. It provides a flexible way to create objects by separating the construction process from the representation, making it easier to create variations of an object.

### 3. Structural Design Patterns

#### Bridge Pattern
**Use Case**: *Notification System*  
This pattern decouples an abstraction from its implementation, allowing for the development of different types of notifications and their delivery mechanisms independently. This flexibility enables easy extension and modification of the notification system.

#### Composite Pattern
**Use Case**: *File System Management*  
This pattern allows for the creation of a tree structure that can represent both individual objects and compositions of objects uniformly. It simplifies the handling of complex hierarchies, such as file systems, by treating individual items and groups uniformly.

