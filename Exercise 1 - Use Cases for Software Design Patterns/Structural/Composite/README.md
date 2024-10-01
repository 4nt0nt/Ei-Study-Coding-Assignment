# Composite Pattern

## Overview
The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. This implementation demonstrates file system management.

## Interface

### FileSystemItem
- **Methods:**
  - `showDetails()`: Displays details about the file or directory.

## Classes

### File
- **Implements:** `FileSystemItem`
- **Attributes:**
  - `name`: The name of the file.
  - `size`: The size of the file.
- **Methods:**
  - `showDetails()`: Displays the file's details.

### Directory
- **Implements:** `FileSystemItem`
- **Attributes:**
  - `name`: The name of the directory.
  - `items`: A list of items (files or directories) contained in the directory.
- **Methods:**
  - `addItem(FileSystemItem item)`: Adds an item to the directory.
  - `removeItem(FileSystemItem item)`: Removes an item from the directory.
  - `showDetails()`: Displays the directory's details and all its contents.

## Usage
The `Main` class demonstrates creating files and directories, adding them to the file system, and displaying their details.

