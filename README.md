# Software Construction — Lab Task 07

## Construction for Reuse: Interfaces, Generics, and Contracts

**University:** University of Engineering & Technology, Abbottabad Campus  
**Department:** Software Engineering  
**Semester:** 5th Semester  
**Course:** Software Construction and Development  
**Instructor:** Engr. Rizwan Shah  
**Lab Date:** 27 October 2026

## Submitted By

**Student Name:** Alamsher  
**Registration No:** 24ABSWE0010

---

## GitHub Repository Link

Add your repository URL here after creating your GitHub repository.

---

## Objective

The objective of this lab is to apply important software construction principles by designing reusable components using interfaces, generics, composition, and contracts. It also focuses on dependency injection, type safety, the Liskov Substitution Principle, and reusable sorting algorithms in Java.

## Software and Tools Used

1. Java
2. Apache NetBeans IDE 31
3. Maven
4. GitHub
5. Java Collections Framework

---

## Lab Tasks

### Task 1 – Black-Box Reuse (Composition via Interfaces)

**Objective:**  
To understand black-box reuse using interfaces and composition.

**Implementation:**

- Created a `PaymentMethod` interface with a `pay(double amount)` method.
- Implemented the interface in `CreditCardPayment`.
- Implemented the interface in `JazzCashPayment`.
- Created an `EcommerceCart` class that accepts a PaymentMethod through its constructor.
- Demonstrated dependency injection by processing payments using different payment methods.

**Result:**  
The EcommerceCart successfully processed payments using both Credit Card and JazzCash without depending on a specific payment implementation.

### Task 2 – Generics and Type Safety

**Objective:**  
To create reusable and type-safe data containers using Java Generics.

**Implementation:**

- Created a generic class named `DataBox<T>`.
- Added a private field, constructor, and getter method.
- Created a `DataBox<String>` to store a student name.
- Created a `DataBox<Integer>` to store a student ID.
- Demonstrated compile-time type safety.

**Result:**  
The generic DataBox class successfully stored and retrieved different data types while preventing incorrect type assignments.

### Task 3 – Liskov Substitution Principle (LSP)

**Objective:**  
To understand contract integrity and identify problems caused by incorrect inheritance.

**Implementation:**

- Created a `Rectangle` base class.
- Created a `Square` subclass that overrides the `setDimensions()` method.
- Demonstrated the LSP problem by treating a Square object as a Rectangle.
- Attempted to set dimensions to width 5 and height 10.
- Created a common `Shape` interface.
- Implemented the interface in `RectangleShape` and `SquareShape` classes.

**Result:**  
The inheritance problem was demonstrated successfully and the architecture was improved using a common Shape interface.

### Task 4 – Reusable Ordering Algorithms (Homework)

**Objective:**  
To understand the difference between Comparable and Comparator in Java.

**Implementation:**

- Created a `Student` class with `rollNo` and `cgpa`.
- Implemented `Comparable<Student>` to sort students by roll number in ascending order.
- Created a `CgpaComparator` class implementing `Comparator<Student>`.
- Sorted students by CGPA in descending order.
- Added three students to an ArrayList.
- Demonstrated both sorting methods.

**Result:**  
Students were successfully sorted by roll number and CGPA using two different comparison approaches.

---

## Source Files

All Java source files are located in the following package:

`com.mycompany.lab07`

### Main and Task Runner Classes

1. `Main.java`
2. `Task1Main.java`
3. `Task2Main.java`
4. `Task3Main.java`
5. `Task4Main.java`

### Task 1 – Payment System

6. `PaymentMethod.java`
7. `CreditCardPayment.java`
8. `JazzCashPayment.java`
9. `EcommerceCart.java`

### Task 2 – Generics

10. `DataBox.java`

### Task 3 – LSP

11. `Rectangle.java`
12. `Square.java`
13. `Shape.java`
14. `RectangleShape.java`
15. `SquareShape.java`

### Task 4 – Sorting

16. `Student.java`
17. `CgpaComparator.java`

---

## How to Run the Project

1. Open Apache NetBeans IDE.
2. Open the Lab07 Maven project.
3. Navigate to `Source Packages`.
4. Open the package `com.mycompany.lab07`.
5. To run all tasks together, run `Main.java`.
6. To run tasks separately, right-click the corresponding task runner class and select **Run File**.

### Separate Task Execution

- `Task1Main.java` – Runs the Payment System.
- `Task2Main.java` – Runs Generics and Type Safety.
- `Task3Main.java` – Runs the LSP demonstration.
- `Task4Main.java` – Runs Student Sorting.

---

## Overall Result

All four lab tasks were implemented and executed successfully. The programs demonstrated black-box reuse, dependency injection, Java Generics, type safety, the Liskov Substitution Principle, and reusable ordering algorithms.

The practical implementation helped strengthen understanding of object-oriented programming and reusable software components.

## Reflection

During this lab, I learned how interfaces and composition help create reusable software components. I also understood how dependency injection allows a class to work with different implementations without depending on a specific class.

Working with Java Generics improved my understanding of type safety and reusable data containers. The Rectangle and Square example helped me understand the importance of the Liskov Substitution Principle and why inheritance should maintain expected behavior.

I also practiced using Comparable and Comparator to sort student records according to different requirements. Overall, this lab improved my understanding of software reuse, interfaces, generics, abstraction, and object-oriented design.
