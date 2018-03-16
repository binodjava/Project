package com.corejava.operators;

public class Lab148 {
	public static void main(String[] args) {
		int a = 12;
		boolean b = a > 10 || a++ < 5;
		System.out.println(a);//12
		System.out.println(b);//false
		
//		JVM will check 1st expression, if it is true wont check other, if it is false then it will
//		check other expression

	}

}
