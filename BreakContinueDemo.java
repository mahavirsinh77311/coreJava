package com.topics.coreJava;

// Program to demonstrate continue and break statement 
public class BreakContinueDemo {

	public static void main(String[] args) {
		// Initially loop is set to run from 1 to 10
		for (int i = 1; i <= 10; i++)
		{
			// if the number is 3 skip it and continue
			if (i == 3)
			{
				continue;
			}
			// terminate the loop when i is 8
			if (i == 8)
			{
				break;
			}
			System.out.println("i is " + i);
		}
	}

}
