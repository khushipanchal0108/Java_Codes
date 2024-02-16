**Student Records Management Application**
This Java application is a straightforward, menu-based system for handling student records. It supports tasks like adding new students, showing details of students, finding students by different attributes, updating student data, and removing students from the record.

**Classes and Functions**
**Student Class**
The Student class is designed to represent individual students with attributes such as their Permanent Registration Number, name, birthdate, and academic marks.

**Attributes:**
- prn: The unique Permanent Registration Number for the student.
- name: The student's name.
- dob: The student's date of birth, formatted as dd/MM/yyyy.
- marks: The academic marks scored by the student.
**Constructors:**
- Student(int prn): Initializes a student object with a PRN.
- Student(int prn, String name): Initializes a student object with a PRN and name.
- Student(int prn, String name, String dob): Initializes a student object with a PRN, name, and birthdate.
- Student(int prn, String name, String dob, double marks): Initializes a student object with a PRN, name, birthdate, and marks.
**Methods:**
- getPrn(): Retrieves the student's PRN.
- setPrn(int prn): Assigns the PRN to the student.
- getName(): Retrieves the student's name.
- setName(String name): Assigns a name to the student.
- getDob(): Retrieves the student's date of birth.
- setDob(String dob): Sets the student's date of birth.
- getMarks(): Retrieves the student's marks.
- setMarks(double marks): Sets the student's marks.
- toString(): Provides a textual representation of the student.

**StudentFunctions Class**
The StudentFunctions class includes methods for various operations on the student records.

**Methods:**
- addStudent(): Registers a new student in the database.
- printStudentDetails(): Displays information of all students in the database.
- searchStu(): Looks for a student using their PRN, name, date of birth, or marks.
- updateOrDelete(): Offers choices to modify or remove student details.
- editStudent(): Permits changes to a student's information.
- deleteStudent(): Removes a student from the database.

**StudentDemo Class**
The StudentDemo class acts as the starting point of the application. It offers a menu-based interface for interacting with the StudentFunctions class.

**Methods:**
- main(String[] args): The primary method that launches the application and provides a menu for performing different actions on student records.
