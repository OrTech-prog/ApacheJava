/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercises09_09;

/**
 *
 * @author orama
 */
public class Student {

    private int studentId;
    private String studentName;
    private double grade;
 

    public Student() {

        this(0, "Not Assigned", 0.0);
    }
 

    public Student(int studentId, String studentName, double grade) {
      
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
 

    public void printDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Grade: " + this.grade);
    }

    public static void main(String[] args) {
       
        System.out.println("Creating a student object using the default constructor:");
        Student student1 = new Student();
        student1.printDetails();
 
        System.out.println("\n----------------------------------\n");
 
        
        System.out.println("Creating a student object using the parameterized constructor:");
        Student student2 = new Student(101, "Alice Smith", 92.5);
        student2.printDetails();
    }
}
