package com.oops.dynamicdispatch;

public class Lab524 {
	public static void main(String[] args) {
		A1 a = new B1();
		System.out.println(a.x);//10
		a.x = 99;//again initializing with 99
		System.out.println(a.x);//99
	}

}

class A1 {
	int x = 10;
}

class B1 extends A1 {
	String x = "JLC";
}
