package com.oops.interfaces;

public class Lab542 {
	public static void main(String[] args) {
		System.out.println("Hello");//Hello
//No Error:
//If you don't want to implement abstract method, make class as abstract

	}

}

interface Inter3 {
	void m1();
	public abstract void m2();
	int a = 10;
	public final int b = 20;
}

abstract class Hello3 implements Inter3 {

}