package com.oops.inheritance;

public class Lab418 {
	public static void main(String[] args) {

		Hai1 hai = new Hai1();
		System.out.println(hai.a);
		System.out.println(hai.b);// With parent class object we can't call
									// child class members.

		Hello1 hello = new Hello1();
		System.out.println(hello.a);//with child class object we can call parent as well as child class members
		System.out.println(hello.b);
	}

}

class Hai1 {
	int a = 99;
}

class Hello1 extends Hai {
	int b = 88;
}