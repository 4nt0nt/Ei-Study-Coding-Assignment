# Builder Pattern

## Overview
The Builder Pattern allows for the step-by-step construction of complex objects. This implementation demonstrates the preparation of a meal, specifically a Biryani.

## Classes

### Meal
- **Attributes:**
  - `base`: The base of the meal.
  - `protein`: The protein component of the meal.
  - `toppings`: A list of toppings for the meal.
  - `sauce`: The sauce accompanying the meal.
- **Methods:**
  - `toString()`: Returns a string representation of the meal.

### MealBuilder
- **Attributes:**
  - `base`: The base of the meal.
  - `protein`: The protein component of the meal.
  - `toppings`: A list for storing toppings.
  - `sauce`: The sauce for the meal.
- **Methods:**
  - `setBase(String base)`: Sets the base of the meal and returns the builder.
  - `setProtein(String protein)`: Sets the protein of the meal and returns the builder.
  - `addTopping(String topping)`: Adds a topping to the meal and returns the builder.
  - `setSauce(String sauce)`: Sets the sauce of the meal and returns the builder.
  - `build()`: Constructs the meal object.

## Usage
The `Main` class demonstrates how to create a meal by using the builder to specify each component and then building the final meal.

