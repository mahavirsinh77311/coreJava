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
        Set < String > inputSet = new HashSet < > ();
        inputSet.add("Java");
        inputSet.add("Scala");
        inputSet.add("Python");
        inputSet.add("Mysql");
        System.out.println("The set is defined as: " + inputSet);
        
        System.out.println("\nIterating over Set using for-each loop:");
        // Using for-each loop for iteration over Set
        for (String elements: inputSet) {
            System.out.print(elements);
            System.out.print(", ");
        }
    }

}