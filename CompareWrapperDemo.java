package com.topics.coreJava;

/** 
 * Represents the comparison of Wrapper class.  
 * @author Mahavirsinh Parmar
 * @version 1.8
 */
public class CompareWrapperDemo {

    public static void main(String[] args) {
        Integer integer1 = 1;
        Integer integer2 = 1;
        System.out.println(integer1 == integer2);

        Integer value1 = new Integer(10);
        Integer value2 = new Integer(20);
        int checken = value1.compareTo(value2);
        System.out.println(checken);
    }

}
