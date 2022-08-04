package com.topics.coreJava;

/** 
 * Represents the use of if/else to check age.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class IfElseDemo {

	public static void main(String[] args) {
		int age = 28;
		if (age < 28) {
			System.out.println("Age is less than 28");
		} else if (age > 28) {
			System.out.println("Age is greater than 28");
		} else {
			System.out.println("Age is equal to 28");
		}
	}

}
