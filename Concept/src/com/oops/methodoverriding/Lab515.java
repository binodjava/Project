package com.oops.methodoverriding;

public class Lab515 {
	public static void main(String[] args) {
		B21 b=new B21();
		b.m1();
		B21.m1();
		
		
		
		/*B->m1()
		B->m1()*/

		
		
	}

}

class A21{
	static void m1(){
		System.out.println("A->m1()");
	}
}
class B21 extends A21{
	static void m1(){
		System.out.println("B->m1()");
	}
}