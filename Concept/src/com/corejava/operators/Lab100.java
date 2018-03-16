package com.corejava.operators;

public class Lab100 {
	public static void main(String[] args) {
//	Typecasting:
//	Implicit: When type casting is done automatically by JVM
//  Explicit: When type casting is done by developer 
//		2 type:Widening: lower->higher
//		      :Narrowing: higher->lower
		
		
		byte b=10;
		short s=b;
		int a=s;
		long x=a;
		float f=x;
		double d=f;
		System.out.println(b);//10
		System.out.println(s);//10
		System.out.println(a);//10
		System.out.println(x);//10
		System.out.println(f);//10.0
		System.out.println(d);//10.0
		
//		Implicit type casting is happening here automatic by JVM
		
		
	}

}
