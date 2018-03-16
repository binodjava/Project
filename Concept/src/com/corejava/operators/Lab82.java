package com.corejava.operators;

public class Lab82 {

	public static void main(String[] args) {
		System.out.println(0 / 0.0);//NaN
		System.out.println(0.0 / 0);//NaN
		System.out.println(-0.0 / 0.0);//NaN
		System.out.println(0.0 / 0.0);//NaN
		double d1 = 0 / 0.0;
		System.out.println(d1);//NaN
		
		double d2=0/0;//RuntimeException
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		
	}
}
