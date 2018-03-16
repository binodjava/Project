package com.oops.classmembers.localvariables;

public class Lab312 {
	public static void main(String[] args) {
		Hello1 h = new Hello1();
	}

}

class Hello1 {
	int a;
	static int b;
	{
		int c = 30;
		System.out.println(a);// 0
		System.out.println(b);// 0
		System.out.println(c);// 30
	}
}