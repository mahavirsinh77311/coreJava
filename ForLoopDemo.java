package com.topics.coreJava;

/** Represents the use of for loop
 * simply prints right rectangle star pattern as standard output.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class ForLoopDemo {

	public static void main(String args[]) {
		// number1 for rows and numberOfRows denotes the number of rows you want to print
		int number1;
		int numberOfRows = 5;
		// Outer loop
		for (number1 = 0; number1 < numberOfRows; number1++) {
			// number2 for columns
			int number2;
			// Inner loop
			for (number2 = 0; number2 <= number1; number2++) {
				// Print star
				System.out.print("* ");
			}
			// Throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

}
