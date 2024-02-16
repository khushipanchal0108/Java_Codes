This Java application is an easy-to-use student management system that can compute and show the outcomes of students based on their scores. It features a menu-driven interface for user interaction, enabling the input of student data, viewing of student profiles, presentation of calculated scores, and program termination.

**Classes and Interfaces**
**Main Class**
The Main class is the starting point of the application. It displays a menu to the user and processes inputs to carry out different functions.

**Methods:**
- main(String[] args): Initiates the program and offers a menu for users to engage with the application.
**Result Class**
Inherits from the Student class and uses the Exam interface. It's responsible for computing and showing a student's results from their scores.

**Attributes:**
- percentage: The student's computed percentage.
**Methods:**
- Result(): Constructor that sets up initial values.
- Percent_cal(): Calculates the student's percentage from their scores.
- enterStudentDetails(Scanner scanner): Inputs a student's details via user input.
- displayStudentInfo(): Shows the student's information.
- displayResult(): Presents the student's computed score.
- toString(): Provides a text description of the result object.
**Exam Interface**
Specifies a Percent_cal() method for calculating a student's percentage.

**Methods:**
- Percent_cal(): A method that needs to be implemented by classes for computing a student's percentage.
**Student Class**
Defines individual students with attributes like their name, roll number, and scores.

**Attributes:**
- name: Student's name.
- roll_no: Student's roll number.
- mark1, mark2: Scores achieved by the student.
**Methods:**
- Student(String name, int roll_no, double mark1, double mark2): Constructor that initializes a student with specific details.
- Accessor and mutator methods for attributes.
- toString(): Gives a text representation of the student.
