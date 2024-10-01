# Singleton Pattern

## Overview
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This implementation manages a database connection.

## Class

### DatabaseConnectionManager
- **Attributes:**
  - `instance`: The single instance of the class.
- **Methods:**
  - `getInstance()`: Returns the single instance of the class, creating it if necessary.
  - `connect()`: Simulates connecting to the database.
  - `disconnect()`: Simulates disconnecting from the database.

## Usage
The `Main` class demonstrates the use of the `DatabaseConnectionManager`, showing that multiple requests for the instance return the same object.

