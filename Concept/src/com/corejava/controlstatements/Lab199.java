package com.corejava.controlstatements;

public class Lab199 {
	public static void main(String[] args) {
		final boolean b1 = true;
		for (; b1;)
			// Infinite Loop
			System.out.println("BK");
		System.out.println("After");//Unreachable code

	}
}
