package com.oops.dynamicdispatch;

public class Lab523 {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.x);// 10

	}
	// 1. When you refer var with super class ref which contains subclass object
	// then var will be referred from super class only
	// 2. When you refer var with sub class ref which contains subclass object
	// then var will be reffered from sub class only
	// 3. When you want to refer varible if sub class with super class ref which
	// contains super class object then you need to type cast
	// ref into sub class.
	// 4. When you refer any var with super class ref variable which contains
	// subclass object then that var should be available int super class as well

}

class A {
	int x = 10;
}

class B extends A {
	String x = "JLC";
}
