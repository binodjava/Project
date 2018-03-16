package com.corejava.operators;

public class Lab76 {
	public static void main(String[] args) {
		int a = 123;
		byte b = a;//Type mismatch: cannot convert from int to byte [need to typecast]
		byte b1=(byte)a;
		System.out.println(a);//123
		System.out.println(b);
		System.out.println(b1);//123
	}

}
