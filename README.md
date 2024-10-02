# Ei-Study-Coding-Assignment

## Exercise 1: Use Cases for Design Patterns

### Objective:
This exercise demonstrates the application of six key design patterns (Iterator, Mediator, Singleton, Builder, Bridge, and Composite) to address common software design challenges.

### Design Patterns Implemented:
1. **Iterator Pattern** - Playlist Management
   - Allows sequential access to songs in a playlist without exposing its internal structure.
   - Classes: ![image](https://github.com/user-attachments/assets/f2e83a37-58e8-48c7-8bf7-9c4743313e4e)

   - OUTPUT: ![image](https://github.com/user-attachments/assets/c5f5c628-8d1a-4746-b784-02020ee547b0)


2. **Mediator Pattern** - Chat Application
   - Enables communication between users through a centralized mediator, simplifying dependencies.
   - Classes: ![image](https://github.com/user-attachments/assets/bbd554f1-5fb5-4611-9d8c-7e3ff3d15847)

   - OUTPUT: ![image](https://github.com/user-attachments/assets/f32928af-d881-403d-9dfc-922411bbd0c6)


3. **Singleton Pattern** - Database Connection Manager
   - Ensures only one instance of a database connection exists to manage resource efficiency.
   - Classes: ![image](https://github.com/user-attachments/assets/0307a58e-fdf9-4eaf-bd52-e4317837bedd)

   - OUTPUT: ![image](https://github.com/user-attachments/assets/2dd0379c-d955-4ced-9008-0965592a0bb8)


4. **Builder Pattern** - Meal Preparation
   - Provides a flexible way to construct complex objects step by step, demonstrated by building a customizable meal.
   - Classes: ![image](https://github.com/user-attachments/assets/f2f482f2-2d18-4604-90a4-06f2d931f89d)

   - OUTPUT: ![image](https://github.com/user-attachments/assets/f337bd8b-3513-4e7d-8ef0-33b1f9793b73)


5. **Bridge Pattern** - Notification System
   - Decouples the abstraction (notification types) from the implementation (delivery mechanisms), allowing independent variation.
   - Classes: ![image](https://github.com/user-attachments/assets/b05281bb-89ca-40e2-9ff1-64dff6aa8365)

   - OUTPUT: ![image](https://github.com/user-attachments/assets/bb337841-9fb1-461b-862b-db961c06050d)


6. **Composite Pattern** - File System Management
   - Treats individual files and directories uniformly, supporting hierarchical structures for easier file system operations.
   - Classes: ![image](https://github.com/user-attachments/assets/95ce212a-72c7-4229-b81d-8e60d79e2d03)

   - OUTPUT: ![image](https://github.com/user-attachments/assets/dd9c9d8b-5ad3-4fc0-b764-751fd5313b30)



## Exercise 2: Real-Time Chat Application

### Objective:
This exercise implements a real-time chat application using Java, focusing on the Observer, Singleton, and Adapter design patterns to achieve message communication between users in chat rooms.

### Features:
- Multiple Users can create or join chat rooms for real-time conversation.
- Users can send and receive messages in real-time, with messages instantly broadcasted to all participants in the chat room.
- Used to notify all users in a chat room when a new message is sent, allowing real-time communication without polling.
- Ensures that only one instance of the server and each chat room exists to manage efficient communication and resource usage.



