package com.oops.classmembers.localvariables;

public class Lab313 {
	public static void main(String[] args) {
		Hello2 h = new Hello2();
	}

}

class Hello2 {
	int a;
	static int b;
	{
		int c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);//The local variable c may not have been initialized
//		local value must be initialized before using it 
	}
}
