package com.corejava.operators;

public class Lab124 {
	public static void main(String[] args) {

		int a = 10;
		a = ++a;
		System.out.println(a);//11   The assignment to variable a has no effect
		a = ++a;
		a = ++a;
		System.out.println(a);//13
	}

}
