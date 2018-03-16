package com.corejava.operators;

public class Lab70 {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = +ch1;//Type mismatch: cannot convert from int to char
		char ch3 = ch1;
		int a = +ch1;//+ operator tell that it's arithmetic operation so result type is int
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(a);
	}

}
