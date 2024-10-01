# Real-Time Chat Application

## Introduction

Real-Time Chat Application is a console-based application in Java that enables a user to join a number of chat rooms, send messages, and thus communicate with people in real-time. The application is multiuser capable and supports features such as message history and private messaging, complete with an active list of users.

## Functionalities

1. **Create/Join Chat Rooms**: The users can use the unique room ID to either create or join a room. If the room ID mentioned does not exist, then a new room will be automatically created.
 2. **Real-Time Messaging**: The users can send and receive messages in real-time. The user who is currently logged in will see all the messages that are being sent in the chat room.

3. **Active Users List**: The command `#actusers` is used by participants so that their list of active participants in the chat room is displayed with an alphabetically sorted order.
 
4. **Private Messaging**: The application provides users with the feature to privately communicate with each other by using `@username message`. It is also a one-on-one form of conversation.
 
5. **Message History**: The chat application maintains the message history of the chat room. In this way, participants could view messages posted even after they have logged off and are now back in the system.
 
# Project Structure

This is a small description of each file in the project:

1. **ChatServer.java**:
  Main server file that manages a room for chats and handles connections coming from the clients. Waits for incoming client connections and routes messages coming between the clients.
  Accepted clients, manages the available chat rooms, broadcasts messages, and user commands.

2. **ChatClient.java** :
- **Description**: Client application through which the user establishes connection with the chat server and can be part of the chat rooms.
   - **Functionalities**: Connects to a server, sends messages, receives messages, shows active users and parses user input.
 
3. **ChatRoom.java**:
   - **Description**: class implementing the chat room that holds user and messages in it.
- **Functionalities**: it counts the people in a room, supports broadcast of the message and the history of the message.
4. **User.java**
   - This class represents a user in chat. It holds details about the user and handles user-specific actions.
   - The class will hold the username together with methods for sending messages and getting notifications.
5. **Message.java**
Class Description: This class describes the chat message that the users send in the chat rooms.
Operations: It stores the content of a message, the sender details, and when it was sent.

