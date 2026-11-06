# 🚗 Car Showroom Management System

A console-based **Car Showroom Management System** developed using Java. This project allows users to manage showroom details, employee information, and car records through a simple menu-driven interface.

It is a beginner-friendly Java project that demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts.

## ✨ Features

- **Add Showrooms:** Enter showroom name, address, manager name, and total employees.
- **Add Employees:** Store employee ID, name, department, and showroom name.
- **Add Cars:** Add car details such as name, color, fuel type, price, type, and transmission.
- **View Showrooms:** Display all registered showroom details.
- **View Employees:** Display all registered employee details.
- **View Cars:** Display all registered car details.
- **Exit:** Exit the application.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Input Handling:** Java Scanner Class
- **Core Concepts:** Object-Oriented Programming (OOP)

## 📚 OOP Concepts Implemented

This project demonstrates the following Java concepts:

1. **Classes and Objects** – Separate classes for `Car`, `Employee`, and `Showroom`.
2. **Inheritance** – Classes inherit from the `Main` class.
3. **Interfaces** – The `utilities` interface defines `setDetails()` and `getDetails()` methods.
4. **Method Overriding** – Classes implement their own versions of interface methods.
5. **Arrays** – Arrays are used to store multiple cars, employees, and showrooms.
6. **Encapsulation (Basic)** – Data and methods are organized within separate classes.

## 📂 Project Structure

```text
Car_Showroom_Management_System/
│
├── Main.java
├── Car.java
├── Employee.java
├── Showroom.java
└── README.md
```

## ⚙️ How to Run the Project

### Prerequisites

- Java JDK installed on your computer.
- Any Java-supported IDE (VS Code, IntelliJ IDEA, Eclipse) or terminal.

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### Step 2: Navigate to the Project Folder

```bash
cd Car_Showroom_Management_System
```

### Step 3: Compile the Java Files

```bash
javac Main.java Car.java Employee.java Showroom.java
```

### Step 4: Run the Application

```bash
java Main
```

## 🖥️ Main Menu

When you run the application, you will see the following menu:

```text
############# Car Showroom Management System #################

     1) Add Showrooms       2) Add Employees       3) Add Cars

     4) Get Showrooms       5) Get Employees       6) Get Cars

                         0) Exit

Enter choice:
```

## ⚠️ Current Limitations

- Maximum of 5 showrooms, 5 employees, and 5 cars can be added in one execution.
- Data is stored in memory using arrays.
- Data is not permanently saved in a database or file.
- The application currently works through a command-line interface.

## 🚀 Future Improvements

- Integrate a database such as MySQL or H2.
- Implement CRUD operations (Create, Read, Update, Delete).
- Add search functionality for cars, employees, and showrooms.
- Implement data validation and exception handling.
- Develop a graphical user interface (GUI).
- Add login and authentication functionality.

## 👨‍💻 Author

**Sumit Gupta**

---

⭐ If you find this project interesting, feel free to star the repository!

**Made with ❤️ using Java.**
