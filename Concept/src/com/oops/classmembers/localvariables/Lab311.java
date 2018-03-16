package com.oops.classmembers.localvariables;

public class Lab311 {
	public static void main(String[] args) {
		Hello h = new Hello();

	}

}

class Hello {
	int a = 10;
	static int b = 20;
	{
		int c = 30;
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println(c);//30
	}
}