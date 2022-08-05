package com.topics.coreJava;

/** 
 * Represents the Exception
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class ExceptionDemo {

    private void
    function() throws IllegalAccessException {
        System.out.println("Inside function(). ");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String args[]) {
        try {
            ExceptionDemo exception = new ExceptionDemo();
            exception.function();
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("Caught in main.");
        } finally {
            System.out.println("Finally block is executed");
        }
    }

}