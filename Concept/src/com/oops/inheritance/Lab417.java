package com.oops.inheritance;

public class Lab417 {

	public static void main(String[] args) {
		Hai hai = new Hai();
		System.out.println(hai.a);
		System.out.println(hai.b);// b cannot be resolved or is not a field
		// we can call any class members by its object only. From different
		// object we can't call diff class members
		// with Hai class object, Hai class members can be called only		
		// with Hello class object, Hello class members can be called only
		
		Hello hello = new Hello();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}
}

class Hai {
	int a = 99;

}

class Hello {
	int b = 88;
}
