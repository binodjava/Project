package com.oops.classmembers.blocks;

public class Lab303 {
	public static void main(String[] args) {
		System.out.println("Main :" + Hello3.a);

	}
}

class Hello3 {
	static int a;
	{
		a = 10;
		System.out.println("Initialized :" + a);
	}
}
//Main :0
//Since object is not created, so instance block won't be executed