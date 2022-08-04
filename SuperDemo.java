package com.topics.coreJava;

/** 
 * Represents the use of super keyword using variable
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Vehicle {
	
    int maxSpeed = 120;
    
}

/** 
 * Sub class extending super class
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Car extends Vehicle {
	
    int maxSpeed = 180;

    void display() {
        // Print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
    
}

/** 
 * Driver Class
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class SuperDemo {

    public static void main(String[] args) {
        Car small = new Car();
        small.display();

    }

}