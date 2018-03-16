package com.corejava.operators;

public class Lab69 {

	public static void main(String[] args) {
		byte a = 19;
		byte b = +a;// Type mismatch: cannot convert from int to byte
		byte c = -a;// Type mismatch: cannot convert from int to byte
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// Note: Any arithmetic operation result is int type.
		int b1 = +a;
		int c1 = -a;
		System.out.println(b1);
		System.out.println(c1);

	}
}
