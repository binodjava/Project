package com.oops.classmembers.blocks;

public class Lab302 {
	public static void main(String[] args) {

		Hello2 h = new Hello2();
		System.out.println("Main :" + h.a);
	}

}

class Hello2 {
	int a;
	{
		a = 10;
		System.out.println("Initialized :" + a);

	}
}

/*
Initialized :10
Main :10*/
