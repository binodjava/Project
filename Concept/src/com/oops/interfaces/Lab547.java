package com.oops.interfaces;

public class Lab547 {
	public static void main(String[] args) {
		Hello10 h=new Hello10();
		h.m1();
		h.m2();
		h.m3();
		

	}
}

class Hello10 implements Inter9,Inter10{

	@Override
	public void m1() {
		System.out.println("Hello->m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("Hello->m2()");
		
	}

	@Override
	public void m3() {
		System.out.println("Hello->m3()");
		System.out.println(b);
		System.out.println(c);
		
	}
	
}