# NoMatchException Java Application

## Overview
This Java application compares an input string provided as a command-line argument with a predefined initial string, "India". If the input does not match the initial string, the application throws a custom exception, `NoMatchException`, indicating the discrepancy and specifying the line number where the error occurred.

## Features
- **String Comparison:** Compares a user-provided input string with the predefined string "India".
- **Custom Exception Handling:** Uses `NoMatchException` to manage and report mismatches between the input string and the initial string.

## Usage
The application is designed to be run from the command line, with the input string passed as an argument.

Example command:
```bash
java Nomatch Brazil
```

## Example Input/Output
Given the command above, the application will produce the following output if the input does not match "India":
```
Error at line number 18 Brazil Does not Match the initial string India
```
And if the input matches "India":
```
India Matches the initial String: India
```

## Error Handling
- **NoMatchException:** This custom exception is thrown when the input string does not match the initial string "India". It includes the line number of the check and a message describing the mismatch.


