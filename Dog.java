/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercises09_09;

/**
 *
 * @author orama
 */
public class Dog {
    
    String name;
    String color;

   
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
       
        Dog myDog = new Dog("Buddy", "Golden");

        
        System.out.println("Dog's name: " + myDog.name);
        System.out.println("Dog's color: " + myDog.color);
    }
}
