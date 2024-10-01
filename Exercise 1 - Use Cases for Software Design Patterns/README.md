# Usage of Design Patterns
This project demonstrates the use of several design patterns through practical use cases. Each pattern is implemented in Java and illustrates how it may be used to address specific design issues.
## Design Patterns and Use Cases

### 1. Behavioral Design Patterns

#### Iterator Pattern

Use Case: *Playlist Management*
- The `Playlist` class allows the addition of `Song` objects and gives back an iterator to access the playlist of songs in a straightforward way. That encapsulates logic for iteration and facilitates the use of enhanced for-loops.
2. Behavioral Design Patterns

 

#### Mediator Pattern

 

**Example Application**: Chat Application
- The `ChatRoom` class is a mediator to let different instances of `User` object send or receive messages but do not have references to each other directly.
3. Creational Design Patterns

#### Singleton Pattern

Use Case: *Database Connection Manager*
- The class `DatabaseConnectionManager` ensures that only one instance of the database connection exists in the entire application, hence making it responsible for managing resource efficiency and preventing any possibility of conflict due to connection.
4. Creational Design Patterns

#### Builder Pattern
Use Case: *Preparation of a Meal*
The class `MealBuilder` gives the ability to construct an object of `Meal` step by step, therefore it can be employed as multiple as it can with various components including base, protein, toppings and sauce.
### 5. Structural Design Patterns

#### Bridge Pattern

Use Case :Notification System
The classes of the `Notification` classes abstract the types of the notifications, such as promotional or transactional from the delivery mechanisms, like SMS or Email, keeping a loose coupling and easy extension.
### 6. Structural Design Patterns

#### Composite Pattern

Use Case :File System Management
The `FileSystemItem` interface would speak to files and directories, making it possible to have a hierarchical structure by which both individual files and directories could be treated uniformly, thereby simplifying the construction of complex file systems.
