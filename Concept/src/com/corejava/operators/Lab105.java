package com.corejava.operators;

public class Lab105 {
	public static void main(String[] args) {
		int a = 300;
		byte b = (byte) a;// Narrowing
		System.out.println(a);//300
		System.out.println(b);//44[byte range is -128 to 127 =256, so 300-256=44]

	}

}
