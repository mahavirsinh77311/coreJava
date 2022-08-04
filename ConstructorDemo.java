package com.topics.coreJava;

/** 
 * Represents the use of default and parameterized constructor
 * parameter1 and parameter2 which we passed give the output.
 * @author mahavirsinh parmar
 * @version 1.8
*/
public class ConstructorDemo {

	int number1;
	int number2;
	
	// Default constructor
	ConstructorDemo() {
		System.out.println("In default constructor");
	}
	
	// Parameterized constructor
	ConstructorDemo(int parameter1, int parameter2) {
		number1 = parameter1;
		number2 = parameter2;
		int number3 = number1 / number2;
		System.out.println(number3);
	}
	
	public static void main(String[] args) {
		// Invoke default constructor
		ConstructorDemo contructorDemo1 = new ConstructorDemo();
		// Invoke Parameterized constructor
		ConstructorDemo constructorDemo2 = new ConstructorDemo(10, 5);
	}

}
