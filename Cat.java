/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercises09_09;

/**
 *
 * @author orama
 */
public class Cat {
    
    String name;
    int age;

   
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
       
        Cat myCat = new Cat();

        
	
        System.out.println("Cat's name: " + myCat.name);
        System.out.println("Age: " + myCat.age);
    }
}
