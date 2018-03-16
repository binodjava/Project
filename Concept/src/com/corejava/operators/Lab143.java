package com.corejava.operators;

public class Lab143 {
	public static void main(String[] args) {
		int a = 99;
		long b = 657999999;
		boolean b1 = (a == 99) && (b == 657999999);
		boolean b2 = (a == 99) && (b == 657999990);
		System.out.println(b1);//true
		System.out.println(b2);//false

	}

}
