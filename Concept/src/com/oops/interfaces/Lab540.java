package com.oops.interfaces;

public class Lab540 {
	public static void main(String[] args) {
		System.out.println("Hello Guys");

	}

}

interface Inter1{
	void m1();
	public abstract void m2();
	int a=10;
	public final int b=20;
}
class Hello implements Inter1{//The type Hello must implement the inherited abstract method Inter1.m1()
}






























abstract class Binod {
	int a = 10;
	static int b = 10;

	Binod() {
		System.out.println("Default Constructor");
	}

	void m1() {
		System.out.println("m1");
	}

	static void m2() {
		System.out.println();
	}
	{
		System.out.println("IB");
	}
	static{
		System.out.println("SB");
	}
	class Prince{
		int p=30;
		void display(){
			System.out.println("Method in prince");
		}
	}
}