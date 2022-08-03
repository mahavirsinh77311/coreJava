package com.topics.coreJava;

// Program to demonstrate default and parameterized constructor
public class ConstructorDemo {

	private int i;
	private int j;
	// Default constructor
	ConstructorDemo() {
		System.out.println("In default constructor");
	}
	// Parameterized constructor
	ConstructorDemo(int x, int y) {
		i = x;
		j = y;
		int z = i / j;
		System.out.println(z);
	}
	public static void main(String[] args) {
		// invoke default constructor
		ConstructorDemo con = new ConstructorDemo();
		// invoke Parameterized constructor
		ConstructorDemo cd = new ConstructorDemo(10, 5);
	}

}
