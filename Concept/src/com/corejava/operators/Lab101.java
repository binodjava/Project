package com.corejava.operators;

public class Lab101 {
	public static void main(String[] args) {
		int a=65;
		char ch=a;//Type mismatch: cannot convert from int to char
		char ch1=(char)a;
		byte b=a;
		byte b1=(byte)a;
		System.out.println(ch1);
		System.out.println(b1);
		
	}

}
