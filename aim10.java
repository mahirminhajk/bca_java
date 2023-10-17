// Create a class Student to read and display the student details. 
// Create another class mark inherit from Student to read marks of 5 subjects and find total and average. 
// Write a Java program to display the result of a student.

import java.util.Scanner;

class Student {
    protected String name;
    protected int rollNumber;

    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Mark extends Student {
    private int[] marks = new int[5];
    private int total;
    private double average;

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / 5;
    }

    public void displayResult() {
        displayDetails();
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        Mark student = new Mark();
        student.readDetails();
        student.readMarks();
        student.calculateTotalAndAverage();
        student.displayResult();
    }
}