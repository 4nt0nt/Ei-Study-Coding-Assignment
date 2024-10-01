# Bridge Pattern

## Overview
The Bridge Pattern decouples an abstraction from its implementation, allowing both to evolve independently. This implementation demonstrates a notification system.

## Interfaces

### NotificationChannel
- **Methods:**
  - `sendNotification(String message)`: Sends a notification message.

## Classes

### SMSChannel
- **Implements:** `NotificationChannel`
- **Methods:**
  - `sendNotification(String message)`: Sends an SMS notification.

### EmailChannel
- **Implements:** `NotificationChannel`
- **Methods:**
  - `sendNotification(String message)`: Sends an email notification.

### Notification
- **Attributes:**
  - `channel`: The channel used to send notifications.
- **Methods:**
  - `notifyUser(String message)`: Abstract method for notifying users.

### PromotionalNotification
- **Extends:** `Notification`
- **Methods:**
  - `notifyUser(String message)`: Notifies users with a promotional message.

### TransactionalNotification
- **Extends:** `Notification`
- **Methods:**
  - `notifyUser(String message)`: Notifies users with a transactional message.

## Usage
The `Main` class demonstrates how to send notifications using different channels for different types of messages.

