package com.topics.coreJava;
import java.util.HashSet;
import java.util.Set;

/** 
 * Represents the Iteration over Set
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class SetDemo {

    public static void main(String[] args) {
        Set < String > input_set = new HashSet < > ();
        input_set.add("Java");
        input_set.add("Scala");
        input_set.add("Python");
        input_set.add("Mysql");
        System.out.println("The set is defined as: " + input_set);
        
        System.out.println("\nIterating over Set using for-each loop:");
        // Using for-each loop for iteration over Set
        for (String elements: input_set) {
            System.out.print(elements);
            System.out.print(", ");
        }
    }

}