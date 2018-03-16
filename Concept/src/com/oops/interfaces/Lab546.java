package com.oops.interfaces;

public class Lab546 {
	public static void main(String[] args) {
		Hello7 h = new Hello7();
		System.out.println(h.a);//10
		System.out.println(h.b);//10
		h.m1();//Hello->m1()
		h.m2();//Hello->m2()
		
		
//one class can implements one or more than one interface but,one class can't extend more than one class
		

	}

}

interface Inter7 {
	void m1();

	int a = 10;

}

interface Inter8 {
	void m2();

	int b = 20;

}

class Hello7 implements Inter7, Inter8 {

	@Override
	public void m1() {
		System.out.println("Hello->m1()");

	}

	@Override
	public void m2() {
		System.out.println("Hello->m2()");

	}

}
