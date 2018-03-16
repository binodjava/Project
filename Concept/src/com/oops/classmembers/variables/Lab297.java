package com.oops.classmembers.variables;

public class Lab297 {
	public static void main(String[] args) {
		new Hai4().b = 99;
		System.out.println(new Hai4().b);//99 [if var is instance, then 0]

	}

}

class Hai4 {
	static int b;

}
