# README for Employee Salary Calculation System

## Description
This Java-based system is designed to manage and calculate salaries for employees. It supports both normal employees and bonus employees, allowing for dynamic calculation of salaries based on various factors including basic wage, bonus percentages, and deductions like EPF (Employee Provident Fund) and ESI (Employee State Insurance). The system prompts the user to input details about the employee, including whether they are eligible for a bonus, and calculates the net salary based on the provided information.

## Classes and Their Roles

- **TestEmployee**: The main class that interacts with the user, taking input to determine if an employee is a bonus employee or a normal employee, and then proceeding with the salary calculation based on the type of employee.

- **Employee (Abstract Class)**: Serves as the base class for both NormalEmployee and BonusEmployee classes. It defines the common properties and methods required for salary calculation, including the abstract method `salaryCalculation()` that is implemented by the subclasses.

- **NormalEmployee**: Extends the Employee class and represents an employee without a bonus. It includes a default constructor for testing purposes and a parameterized constructor for creating instances with specific attributes. It implements the `salaryCalculation()` method to compute the salary for a normal employee.

- **BonusEmployee**: Similar to NormalEmployee but for employees eligible for bonuses. It also includes both default and parameterized constructors and implements the `salaryCalculation()` method, taking into account the bonus percentage to calculate the final salary.

## How to Use
1. Compile the Java files.
2. Run the `TestEmployee` class. This will start the program and prompt you to enter details about the employee.
3. Follow the prompts in the console to enter information such as whether the employee is a bonus employee, their monthly bonus amount (if applicable), and other required details like employee ID, department, date of joining, UAN, PF number, bank name, bank account number, gross wage, and leaves taken.
4. Based on the input, the program will calculate and display the employee's salary details, including basic wage, HRA (House Rent Allowance), conveyance allowance, medical allowance, other allowances, total earnings, EPF, ESI, total deductions, and the net salary.
