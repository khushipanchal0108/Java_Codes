# FactorialException Java Application

## Overview
This Java application calculates the factorial of numbers provided as command-line arguments. It specifically handles calculations for numbers in the range of 1 to 15 and includes custom exception handling for out-of-range values and non-integer inputs.

## Features
- **Factorial Calculation:** Computes the factorial of integers within a specific range (1 to 15).
- **Custom Exception Handling:** Utilizes a custom exception, `FactorialException`, to manage errors related to input values outside the allowable range.
- **Input Validation:** Checks for non-integer inputs and provides appropriate error messages.

## Usage
The application is designed to be run from the command line, with one or more integers passed as arguments. 

Example command:
```bash
java Fact 5 10 -1 20 ABC
```

## Example Input/Output
Given the above command, the application might produce the following output:
```
The factorial of 5 is 120
The factorial of 10 is 3628800
Caught in the exception: Value out of range (1 to 15) for -1
Caught in the exception: Value out of range (1 to 15) for 20
Input Error: For input string: "ABC" Please enter integers
```

## Error Handling
- **FactorialException:** Thrown when the input integer is less than 0 or greater than 15, with a message indicating the allowed range.
- **NumberFormatException:** Caught and handled for inputs that cannot be parsed as integers, with an error message indicating that only integers are acceptable.
