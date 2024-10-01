# Mediator Pattern

## Overview
The Mediator Pattern centralizes communication between components, reducing dependencies between them. This implementation showcases a simple chat application.

## Interfaces

### ChatRoomMediator
- **Methods:**
  - `sendMessage(String msg, User user)`: Sends a message to all users except the sender.
  - `addUser(User user)`: Adds a user to the chat room.

## Classes

### ChatRoom
- **Implements:** `ChatRoomMediator`
- **Attributes:**
  - `users`: A list of users in the chat room.
- **Methods:**
  - `sendMessage(String msg, User user)`: Sends messages to all users.
  - `addUser(User user)`: Adds a user to the chat room.

### User
- **Attributes:**
  - `mediator`: The mediator managing the communication.
  - `name`: The name of the user.
- **Methods:**
  - `send(String msg)`: Sends a message through the mediator.
  - `receive(String msg)`: Receives a message.

### ChatUser
- **Extends:** `User`
- **Methods:**
  - `send(String msg)`: Sends a message and notifies other users.
  - `receive(String msg)`: Displays received messages.

## Usage
The `Main` class demonstrates the creation of a chat room, adding users, and sending messages.

