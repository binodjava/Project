package com.oops.classmembers.blocks;

public class Lab304 {
	public static void main(String[] args) {
		System.out.println("Main :" + Hello4.a);
	}

}

class Hello4 {
	static int a;
	static {
		a = 10;
		System.out.println("Initialized :" + a);
	}

}


/*Initialized :10
Main :10*/
//static block will be called at class loading 