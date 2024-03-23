# RationalNumbers Java Application

## Overview
This Java application is designed to perform arithmetic operations on rational numbers. It allows users to input two rational numbers and calculates their sum, difference, product, and quotient. It also compares the two rational numbers, converts them to floating point values, and determines their absolute values.

## Features
- **Arithmetic Operations:** Perform addition, subtraction, multiplication, and division on rational numbers.
- **Comparison:** Compare two rational numbers to determine if they are equal or which one is greater.
- **Conversion to Float:** Convert rational numbers to their floating point representation.
- **Absolute Value:** Calculate the absolute value of rational numbers.

## Usage
1. Run the application.
2. When prompted, enter the first rational number in the format `a/b` (where `a` is the numerator and `b` is the denominator).
3. Enter the second rational number in the same format.
4. The application will display the results of various operations performed on these rational numbers.

## Example Input/Output
```
Enter first rational number (in the form a/b): 1/2
Enter second rational number (in the form a/b): 3/4
Addition: 5/4
Subtraction: -1/4
Multiplication: 3/8
Division: 2/3
Comparison: The two rational numbers are not equal
Floating Point Value of First Rational Number: 0.5
Floating Point Value of Second Rational Number: 0.75
Absolute Value of First Rational Number: |1/2|= 1/2
Absolute Value of Second Rational Number: |3/4|= 3/4
```

## Error Handling
- The application handles division by zero, invalid input formats, and other input errors gracefully, providing clear error messages to guide the user.

## Development
The application consists of two main classes:
- **RationalNumbers:** Represents a rational number and contains methods for arithmetic operations, comparison, conversion, and more.
- **Part1_2:** Contains the `main` method for user interaction and to demonstrate the features of the `RationalNumbers` class.

