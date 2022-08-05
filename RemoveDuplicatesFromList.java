package com.topics.coreJava;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/** 
 * Represents the List of String
 * Duplicate String values are removed using LinkedHashSet.
 * @author mahavirsinh parmar
 * @version 1.8
 */
public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List < String > list = new ArrayList < String > ();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("E");
        list.add("E");
        System.out.println("The list is defined as: " + list.toString());
        Set < String > result_set = new LinkedHashSet < String > (list);
        System.out.println("The list after removing the duplicates: " + result_set);
    }

}