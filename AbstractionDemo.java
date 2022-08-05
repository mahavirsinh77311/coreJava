package com.topics.coreJava;

/** 
 * Represents the Abstraction
 * Shape class is abstract class which has two abstract methods.
 * @author mahavirsinh parmar
 * @version 1.8
*/
abstract class Shape {
	
    private String color;
    // These are abstract methods
    abstract double area();
    abstract String function();

    // Abstract class can have the constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // This is a concrete method
    public String getColor() {
        return color;
    }
    
}

/** 
 * Represents the Abstraction
 * Circle class is child class which extends Shape class and implements two abstract methods.
 * @author mahavirsinh parmar
 * @version 1.8
*/
class Circle extends Shape {
	
    private double radius;

    public Circle(String color, double radius) {
        // Calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
      return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String function() {
        return "Circle color is " + super.getColor() + " And area is : " + area();
    }
    
}

/** 
 * Represents the Abstraction
 * Rectangle class is child class which extends Shape class and implements two abstract methods.
 * @author mahavirsinh parmar
 * @version 1.8
*/
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        // Calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override 
    double area() {
        return length * width;
    }

    @Override 
    public String function() {
        return "Rectangle color is " + super.getColor() + " And area is : " + area();
    }
    
}

/** 
 * Represents the DriverClass.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class AbstractionDemo {

    public static void main(String[] args) {
        Shape shape1 = new Circle("Red", 2.2);
        Shape shape2 = new Rectangle("Yellow", 2.0, 4.0);
        System.out.println(shape1.function());
        System.out.println(shape2.function());
    }

}