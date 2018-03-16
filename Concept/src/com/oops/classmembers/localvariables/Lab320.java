package com.oops.classmembers.localvariables;

public class Lab320 {
	public static void main(String[] args) {

		Hello9 h = new Hello9();
		System.out.println("Main :" + h.a);//a cannot be resolved or is not a field
//		a is local var, can be used inside instance block only
//		outside of instance block we can't use it.
	}

}

class Hello9 {
	{
		int a = 10;
		System.out.println("Block I :" + a);
	}

}
