package com.corejava.variables;

public class Lab15 {
	public static void main(String[] args) {
		final int A;
		A = 99;
		System.out.println(A);
		A = 98;//The final local variable A may already have been assigned
		System.out.println(A);

		//Once, final variable is initialize can't be modified
		
	}
}
