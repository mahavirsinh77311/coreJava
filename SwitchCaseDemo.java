package com.topics.coreJava;

// program to show the use of switch case to display the month based on the number assigned.
public class SwitchCaseDemo {

	public static void main(String[] args) {
		int month = 13;
		  switch (month) {
		   case 1:
		    System.out.println("Current Month: January");
		    break;
		   case 2:
		    System.out.println("Current Month: February");
		    break;
		   case 3:
		    System.out.println("Current Month: March");
		    break;
		   case 4:
		    System.out.println("Current Month: April");
		    break;
		   case 5:
		    System.out.println("Current Month: May");
		    break;
		   case 6:
		    System.out.println("Current Month: June");
		    break;
		   case 7:
		    System.out.println("Current Month: July");
		    break;
		   case 8:
		    System.out.println("Current Month: August");
		    break;
		   case 9:
		    System.out.println("Current Month: September");
		    break;
		   case 10:
		    System.out.println("Current Month: October");
		    break;
		   case 11:
		    System.out.println("Current Month: November");
		    break;
		   case 12:
		    System.out.println("Current Month: December");
		    break;
		   default:
		    System.out.println("Invalid input - Wrong month number.");
		    break;
		  }
	}

}
