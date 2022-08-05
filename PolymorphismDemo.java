package com.topics.coreJava;

/** 
 * Represents the Polymorphism
 * Parent class is super class it has one method.
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Parent {

    // Implementing a method
    public void method() {
        System.out.println("Method 1");
    }

}

/** 
 * Represents the Polymorphism
 * Child class is sub class it has three methods in which one is overridden from super class.
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Child extends Parent {

    @Override
    public void method() {
        System.out.println("Method 2");
    }

    // First addition function
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    // Second addition function
    public double add(double number1, double number2) {
        return number1 + number2;
    }

}

/** 
 * Represents the Driver Class
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        // Runtime Polymorphism
        Parent parent = new Child();
        parent.method();

        Child child = new Child();
        // Here, the first addition function is called
        System.out.println(child.add(3, 4));
        // Here, the second addition function is called
        System.out.println(child.add(2.5, 2.5));
    }

}