# Java Shapes Calculator

This repository contains a Java application that serves as an educational tool for demonstrating the use of interfaces and class inheritance in Java. 
The application calculates the area and perimeter of various shapes, specifically Circles, Triangles, and Rectangles. It showcases how to implement an interface and extend it through concrete classes, each representing a different geometric shape.

## Assignment Description

The assignment's core objective is to illustrate the principles of Object-Oriented Programming (OOP), specifically focusing on interfaces and inheritance. Users are prompted to input dimensions for each shape, and the application calculates and displays the area and perimeter of these shapes based on the provided dimensions.

### Features

- **Interface Implementation:** The `Shape` interface defines methods for calculating the area and perimeter, which are implemented by the concrete shape classes.
- **Class Inheritance:** Concrete classes `Circle`, `Triangle`, and `Rectangle` implement the `Shape` interface, demonstrating polymorphism.
- **User Input:** The application takes user input for the dimensions of the shapes to perform calculations.
- **Calculation of Area and Perimeter:** For each shape, the application calculates and displays the area and perimeter.

### Code Structure

- **Shape Interface:** Defines the structure that all shape classes must follow.
- **Circle Class:** Implements the `Shape` interface, representing a circle.
- **Triangle Class:** Implements the `Shape` interface, representing a triangle.
- **Rectangle Class:** Implements the `Shape` interface, representing a rectangle.
- **Main Class:** Contains the `main` method to run the application, demonstrating the usage of shape classes and handling user input.
