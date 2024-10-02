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
Classes: ![image](https://github.com/user-attachments/assets/8c836327-6b7d-42ee-b5a8-f71bec7ed5db)

Usage is depicted with multiple terminals, where each terminal is a user (client) and attempts to connect to the chat server by creating a TCP socket to server's port number '33333'
![image](https://github.com/user-attachments/assets/48769429-c4be-40dc-ae18-bdf3fbd0a6f4) (this is done in multiple terminals)

Entering the Server (The chat app), Each user is asked to enter details; their username and the name of the room in which they want to join 
Terminal 1: ![image](https://github.com/user-attachments/assets/ea449d90-c40d-4948-8b36-6619d05caf51)    Terminal 2: ![image](https://github.com/user-attachments/assets/a1be8c4e-ab0a-4788-8b51-25a150db0b0a)  
Terminal 3: ![image](https://github.com/user-attachments/assets/2f93b399-70f8-41f9-8715-7aee415518a6)    Terminal 4: ![image](https://github.com/user-attachments/assets/48510ae7-ddcc-42fb-bffe-8cf8d4f55bdb)

And as each user joins, the previously joined users get notified of the users joining after them...
lets look into Terminal 1 as new users join (Terminals 2, 3, 4) -> ![image](https://github.com/user-attachments/assets/c0347f6a-4114-40db-8191-4f888f300512)

**Note:** The room name entered - If the room doesnt already exist, it gets created and the user joins in, if it already exists, users join directly.
Therefore for user 1, the room gets created when the enter room name, and for subsequent users, Since they enter the same name, the just join in the already created room.

Message sent by one user (Terminal 1) -> ![image](https://github.com/user-attachments/assets/bdfc77c6-c2a0-4533-9ddb-e67a0d17f032)

gets broadcasted to all other users -> 

Terminal 2: ![image](https://github.com/user-attachments/assets/903c12e6-371e-4a21-94d7-511bb6c7e33c)

Terminal 3: ![image](https://github.com/user-attachments/assets/d70e4205-bc1c-4a10-87e1-6c71bb944f9d)

Terminal 4: ![image](https://github.com/user-attachments/assets/9d767c37-8085-414c-9478-3ae7a2c61223)

and all users are able to reply with messages; ![image](https://github.com/user-attachments/assets/dca9131e-beb3-41bf-8614-4598152b7a20)

Moreover, if any user wants to know the list of users present inside the chat app at any point of time, they can use the `#actusers` command

It displays the current active users -> ![image](https://github.com/user-attachments/assets/330bd2db-8c1c-4e6d-9cf1-e7ccfc1f8172)

Also, there is a private messaging feature, which unicasts a private message from one user to another user,

The `#private` command is used in the format: `#private <desired username> -Message-` 

Private message sent -> ![image](https://github.com/user-attachments/assets/0be26bad-3abc-4c6a-a14e-444ddf9d9d23)  Private message received -> ![image](https://github.com/user-attachments/assets/80d69c87-d2cc-47df-9834-8eec3b5b315c)


### Features:
- Multiple Users can create or join chat rooms for real-time conversation.
- Users can send and receive messages in real-time, with messages instantly broadcasted to all participants in the chat room.
- Used to notify all users in a chat room when a new message is sent, allowing real-time communication without polling.
- Ensures that only one instance of the server and each chat room exists to manage efficient communication and resource usage.



