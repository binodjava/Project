package com.oops.classmembers.localvariables;

public class Lab314 {
	public static void main(String[] args) {

		System.out.println("Man :" + Hello3.a);
	}

}

class Hello3 {
	static int a;
	static {
		static int b;//Illegal modifier for the variable b; only final is permitted
//		only final is allowed for local variable, other than that will gives error
		System.out.println(a);
		System.out.println(b);
	}
}
