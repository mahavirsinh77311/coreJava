package com.topics.coreJava;
import java.util.ArrayList;
import java.util.Iterator;

/** 
 * Represents the List of String
 * String values are added and iterated.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class ListIterateDemo {

    public static void main(String[] args) {
        ArrayList < String > list = new ArrayList < String > ();
        list.add("Hello");
        list.add("World");
        list.add("Mahavir");
        list.add("Java");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}