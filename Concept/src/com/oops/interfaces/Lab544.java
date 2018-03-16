package com.oops.interfaces;

public class Lab544 {
	public static void main(String[] args) {
		Inter6 ref = null;
		// ref=new Inter6();
		ref = new Hello6();
		ref.m1();
		ref.m2();
		
		/*Hello->m1() :10
		Hello->m2a() :20*/

		
//We can't create object of interface,
		

	}

}

interface Inter6 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

class Hello6 implements Inter6 {

	@Override
	public void m1() {
		System.out.println("Hello->m1() :" + a);

	}

	@Override
	public void m2() {
		System.out.println("Hello->m2a() :" + b);

	}

}