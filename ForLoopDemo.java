package com.topics.coreJava;

// printing right triangle pattern using for loop
public class ForLoopDemo {

	public static void main(String args[]) {
		// i for rows and row denotes the number of rows you want to print
		int i;
		int row = 5;
		// Outer loop
		for (i = 0; i < row; i++)
		{
			// j for columns
			int j;
			// Inner loop
			for (j = 0; j <= i; j++)
			{
				// print star
				System.out.print("* ");
			}
			// Throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

}
