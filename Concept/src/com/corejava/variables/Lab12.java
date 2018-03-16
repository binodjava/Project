package com.corejava.variables;

public class Lab12 {
	public static void main(String[] args) {
		final int A = 99;
		System.out.println(A);
		A = 88;//The final local variable A cannot be assigned. It must be blank and not using a compound assignment
		System.out.println(A);
	//Note: Final variable is just like constant, once it initialize, can't be changed/modified
	
	}

}
