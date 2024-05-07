# Employee Management System

The Employee Management System is a Java application that allows users to manage employee data through a simple graphical user interface (GUI). The system performs basic database operations such as adding, updating, and viewing employee records. This project uses JavaFX for the GUI and MySQL as the backend database.

## Features

- **Add Employees:** Users can add new employee records to the database.
- **Update Employees:** Users can update existing employee records.
- **View Employees:** Users can view all employee records.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java:** Java JDK 11 or newer must be installed on your system.
- **MySQL:** MySQL Server must be installed and running on your system.
- **JavaFX:** JavaFX SDK must be set up in your Java project.

## Setup and Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourgithubusername/employee-management-system.git
   cd employee-management-system
   ```

2. **Database Configuration:**
   - Start your MySQL server.
   - Create a new MySQL database named `Employee_DB`:
     ```sql
     CREATE DATABASE Employee_DB;
     USE Employee_DB;
     ```
   - Ensure the database user, password, and URL in `EmployeeDatabase.java` match your MySQL setup.


## Usage

Once the application is running:
- **Adding an Employee:** Enter the employee's name, age, email, and department, and click on "Add Employee".
- **Viewing Employees:** Click on "View Employees" to see a list of all employees.
- **Updating an Employee:** Enter the employee ID along with new details and click on "Update Employee".
