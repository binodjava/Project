package com.oops.classmembers.variables;

public class Lab293 {
	public static void main(String[] args) {

		Hai h = new Hai();
		System.out.println(h.b);//  0  The static field Hai.b should be accessed in a static way
		h.b = 99;// same error
		System.out.println(h.b);//   99   same error
	}

}

class Hai {
	static int b;
}
