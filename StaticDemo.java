package com.topics.coreJava;

/** 
 * Represents the static method, variables, block.  
 * @author Mahavirsinh Parmar
 * @version 1.8
 */
public class StaticDemo {

    // Static variables
    static int number1 = 10;
    static int number2;

    // Static method
    static void function(int number3) {
        System.out.println("X = " + number1);
        System.out.println("Y = " + number2);
        System.out.println("Z = " + number3);
    }

    // Static block
    static {
        System.out.println("Running static initialization block.");
        number2 = number1 + 5;
    }

    public static void main(String args[]) {
        function(8);
    }

}