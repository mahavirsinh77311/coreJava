package com.topics.coreJava;

/** 
 * Represents the encapsulation
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Encapsulate {

    // Private variables can only be accessed by public methods of class
    private String name;
    private int rollNumber;
    private int age;

    // Get method to access age
    public int getAge() {
        return age;
    }

    // Get method to access name
    public String getName() {
        return name;
    }

    // Get method to access rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Set method to access age
    public void setAge(int newAge) {
        age = newAge;
    }

    // Set method to access name
    public void setName(String newName) {
        name = newName;
    }

    // Set method to access rollNumber
    public void setRollNumber(int newRollNumber) {
        rollNumber = newRollNumber;
    }
    
}

/** 
 * Represents the driver class for encapsulation
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class EncapsulationDemo {

    public static void main(String[] args) {
        Encapsulate object = new Encapsulate();
        // Setting values of the variables
        object.setName("Harsh");
        object.setAge(19);
        object.setRollNumber(51);

        // Displaying values of the variables
        System.out.println("Students's name: " + object.getName());
        System.out.println("Students's age: " + object.getAge());
        System.out.println("Students's rollNumber: " + object.getRollNumber());
    }

}