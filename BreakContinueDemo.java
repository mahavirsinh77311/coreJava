package com.topics.coreJava;

/** 
 * Represents the use of break and continue keywords
 * skip the number 3 and stop at the 7.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class BreakContinueDemo {

	public static void main(String[] args) {
		// Initially loop is set to run from 1 to 10
		for (int i = 1; i <= 10; i++) {
			// if the number is 3 skip it and continue
			if (i == 3) {
				continue;
			}
			// terminate the loop when i is 8
			if (i == 8) {
				break;
			}
			System.out.println("I is " + i);
		}
	}

}
