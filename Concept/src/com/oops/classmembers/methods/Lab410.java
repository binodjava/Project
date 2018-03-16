package com.oops.classmembers.methods;

public class Lab410 {
	static {
		System.out.println("SB");
	}

	public static void main(String args) {
		System.out.println("main()");
	}

}


/*
Error: Main method not found in class com.oops.classmembers.methods.Lab410, please define the main method as:
	   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application*/
