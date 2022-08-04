package com.topics.coreJava;

/** 
 * Represents the various methods of String.  
 * @author Mahavirsinh Parmar
 * @version 1.8
 */
public class StringMethods {

    public static void main(String[] args) {
    	// The length is the number of characters that a given string contains.
        String string = "Saket Saurav";
        System.out.println(string.length());

        // A ‘+’ operator for concatenating two or more strings.
        String string1 = "Software";
        String string2 = "Testing";
        System.out.println(string1 + string2);
        // A concat() is an inbuilt method for String concatenation in Java.
        System.out.println(string1.concat(string2));

        // This method is used to convert all the characters of a string into a Character Array.
        char[] characters = string.toCharArray();
        System.out.println(characters);
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        // This method is used to retrieve a single character from a given String.
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(6));

        // This method is used to compare two Strings. The comparison is based on alphabetical order. 
        String string4 = "Zeus";
        String string5 = "Chinese";
        String string6 = "American";
        String string7 = "Indian";
        System.out.println(string4.compareTo(string5));
        //C comes 23 positions before Z, so it will give you 23
        System.out.println(string6.compareTo(string7));
        // I comes 8 positions after A, so it will give you -8

        // This method is used to determine whether a substring is a part of the main String or not.
        String string9 = "Softwaretestinghelp";
        System.out.println("Testing is a part of Softwaretestinghelp: " + string9.contains(string2));
        System.out.println("Software is a part of Softwaretestinghelp: " + string9.contains(string1));

        //  Split() method is used to split or separate the given String into multiple substrings
        String string10 = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
        String[] split = string10.split("xyz");
        for (String object: split) {
            System.out.println(object);
        }

        // This method is used to perform a search operation for a specific character or a substring on the main String.
        String string11 = "Saket Saurav " + "performing a search";
        System.out.println(string11);
        System.out.println("Index of 't' is " + string11.indexOf('t'));
        System.out.println("Index of 'u' is " + string11.indexOf('u'));
        System.out.println("Last index of 'S' is " + string11.lastIndexOf('S'));
        System.out.println("Last index of 's' is " + string11.lastIndexOf('s'));

        // This method returns the String equivalent of the object that invokes it.
        Integer object1 = new Integer(10);
        String string12 = object1.toString();
        String string13 = object1.toString(80);
        String string14 = object1.toString(9823, 2);
        //The above line will represent the String in base 2
        System.out.println("The String representation is " + string12);
        System.out.println("The String representation is " + string13);
        System.out.println("The String representation is " + string14);

        // The StringBuffer reverse() method is used to reverse the input characters of the String
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        // The replace() method is used to replace the character with the new characters in a String.
        String replace = string.replace('v', 'b');
        System.out.println(string);
        System.out.println(replace);

        // The Substring() method is used to return the substring of the main String.
        System.out.println(string9.substring(8, 12));
        //It will start from 8th character and extract the substring till 12th character
        System.out.println(string9.substring(15, 19));
    }

}