package com.oops.inheritance;

public class Lab419 {
	public static void main(String[] args) {

		Hai2 hai = new Hai2();
		System.out.println(hai.a);// 99

		Hello2 hello = new Hello2();
		System.out.println(hello.a);// 99
		System.out.println(hello.b);// 88
		// Conclusion:With child class object we can call either child class or
		// parent class members
//		but with parent class object we can call only parent class not child class

	}

}

class Hai2 {
	int a = 99;
}

class Hello2 extends Hai2 {
	int b = 88;
}