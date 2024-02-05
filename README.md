# Java_Codes
This repository contains a Java console application for performing simple math calculations. It includes classes for input handling, performing calculations, and managing the application flow.

Classes:
1. Input
This class is used for taking two numbers from the user. It uses a Scanner to read the numbers entered by the user and stores them in an array.
- inputNumbers(): Asks the user to enter two numbers, reads them, and returns them as an array of doubles.

2. Calculator
This class contains methods for various math operations like addition, subtraction, multiplication, division, square root, power, mean, and variance.
- addition(double n1, double n2): Returns the sum of two numbers.
- subtraction(double n1, double n2): Returns the difference between two numbers.
- multiplication(double n1, double n2): Returns the product of two numbers.
- division(double n1, double n2): Returns the quotient of two numbers. Throws an exception if dividing by zero.
- sqrt(double n): Returns the square root of a number.
- power(double base, double exponent): Returns the result of raising a base to an exponent.
- mean(double[] numbers): Calculates and returns the average of an array of numbers.
- variance(double[] numbers): Calculates and returns the variance of an array of numbers. It prints a message and returns NaN if there's insufficient data.

3. Main
This is the entry point of the application. It uses a Scanner to read user input, creates a Calculator object for performing operations, and manages the application flow through a loop that allows users to perform multiple operations until they decide to exit.
- The main method displays a menu of operations, reads the user's choice, and uses the Calculator object to perform the selected operation. It then displays the result and asks the user if they want to perform another operation.

The application is designed to be user-friendly, prompting the user for input and choices, and providing results based on those choices.
