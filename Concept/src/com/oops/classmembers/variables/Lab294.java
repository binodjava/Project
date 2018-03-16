package com.oops.classmembers.variables;

public class Lab294 {
	public static void main(String[] args) {

		Hai h1 = new Hai();
		Hai h2 = new Hai();
		System.out.println(h1.b + "\t" + h2.b);
		h1.b = 99;
		System.out.println(h1.b + "\t" + h2.b);

	}

}

class Hai1 {
	static int b;
}



/*0	0
99	99*/