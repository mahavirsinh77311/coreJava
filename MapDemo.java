package com.topics.coreJava;
import java.util.HashMap;
import java.util.Map;

/** 
 * Represents the Map of key value pair
 * String is as key and also as value.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class MapDemo {

    public static void main(String[] args) {
        Map < String, String > map = new HashMap < String, String > ();

        // Enter name/address pair
        map.put("Santosh", "Ahmedabad");
        map.put("Lalit", "Vadodara");
        map.put("Milan", "Surat");
        map.put("Atul", "Bhuj");

        // Using for-each loop for iteration over Map.entrySet()
        for (Map.Entry < String, String > entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}