package com.topics.coreJava;

/** 
 * Represents the Interface
 * InterfaceTest has one abstract method which is only declared.
 * @author mahavirsinh parmar
 * @version 1.8
*/
interface InterfaceTest {

    final int value1 = 10;

    // Abstract method
    void display();
    
}

/** 
 * A class that implements the interface.
 * @author mahavirsinh parmar
 * @version 1.8
*/
class InterfaceDemo implements InterfaceTest {

    // Implementing the capabilities of interface.
    public void display() {
        System.out.println("In Display");
    }

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.display();
        System.out.println(value1);
    }
    
}