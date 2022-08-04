package com.topics.coreJava;

/** 
 * Represents the use of this keyword
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class ThisDemo {
    int value1 = 10;
    int value2 = 20;

    public void display() {
        // referring current class
        this.value1 = 100;
        System.out.println(value1);

        // referring current class
        this.value2 = 600;
        System.out.println(value2);
    }
    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        thisDemo.display();
    }
}