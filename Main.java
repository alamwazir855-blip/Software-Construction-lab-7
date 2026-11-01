package com.mycompany.lab07;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // =====================================
        // TASK 1: BLACK-BOX REUSE
        // =====================================

        System.out.println("===== TASK 1: PAYMENT SYSTEM =====");

        PaymentMethod creditCard = new CreditCardPayment();

        EcommerceCart cart1 = new EcommerceCart(creditCard);

        cart1.checkout(2500.0);

        System.out.println();

        PaymentMethod jazzCash = new JazzCashPayment();

        EcommerceCart cart2 = new EcommerceCart(jazzCash);

        cart2.checkout(1500.0);


        // =====================================
        // TASK 2: GENERICS
        // =====================================

        System.out.println("\n===== TASK 2: GENERICS =====");

        DataBox<String> nameBox =
                new DataBox<>("Ihsan Ullah");

        DataBox<Integer> idBox =
                new DataBox<>(12345);

        System.out.println("Student Name: " + nameBox.getValue());

        System.out.println("Student ID: " + idBox.getValue());


        // =====================================
        // TASK 3: LISKOV SUBSTITUTION PRINCIPLE
        // =====================================

        System.out.println("\n===== TASK 3: LSP =====");

        Rectangle rectangle = new Square();

        try {

            rectangle.setDimensions(5, 10);

            System.out.println("Rectangle Area: "
                    + rectangle.getArea());

        } catch (IllegalArgumentException e) {

            System.out.println("LSP Problem: " + e.getMessage());

        }


        // Corrected design using Shape interface

        Shape rectangleShape = new RectangleShape(5, 10);

        Shape squareShape = new SquareShape(5);

        System.out.println("Fixed Rectangle Area: "
                + rectangleShape.getArea());

        System.out.println("Fixed Square Area: "
                + squareShape.getArea());


        // =====================================
        // TASK 4: STUDENT SORTING
        // =====================================

        System.out.println("\n===== TASK 4: STUDENT SORTING =====");

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.50));

        students.add(new Student(101, 3.80));

        students.add(new Student(102, 3.20));


        // Sorting by Roll Number

        Collections.sort(students);

        System.out.println("\nSorted by Roll Number:");

        for (Student student : students) {

            System.out.println(student);

        }


        // Sorting by CGPA (Descending)

        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorted by CGPA (Highest First):");

        for (Student student : students) {

            System.out.println(student);

        }

    }
}