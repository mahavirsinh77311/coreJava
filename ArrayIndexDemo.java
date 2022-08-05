package com.topics.coreJava;

/** 
 * A class simply gives the index of Array elements
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class ArrayIndexDemo {

    public int findIndex(int[] myArray, int parameter) {
        if (myArray == null) {
        	return -1;
        }
        int length = myArray.length;
        int number = 0;
        while (number < length) {
            if (myArray[number] == parameter) {
                return number;
            } else {
                number = number + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        ArrayIndexDemo array = new ArrayIndexDemo();
        System.out.println("Index position of 25 is: " + array.findIndex(myArray, 25));
        System.out.println("Index position of 77 is: " + array.findIndex(myArray, 77));
    }

}