package com.oops.methodoverriding;

public class Lab514 {
	public static void main(String[] args) {
		B20 bobj = new B20();
		bobj.m1();//
		
		/*B->m1()
		A->m1()*/


}
}

class A20 {
	void m1() {
		System.out.println("A->m1()");
	}
}

class B20 extends A20 {
	void m1() {
		System.out.println("B->m1()");
		super.m1();//immediate super class object i.e "A20"
//		so calling m1() with super class object, then super class method will be called
	}
}
