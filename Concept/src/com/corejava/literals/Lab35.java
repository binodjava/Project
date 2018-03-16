package com.corejava.literals;

public class Lab35 {
	public static void main(String[] args) {
		char ch1 = -1; // Type mismatch: cannot convert from int to char
		char ch2 = 65536; // Type mismatch: cannot convert from int to char

		char ch3 = (char) -1;
		char ch4 = (char) 65536;// Type mismatch: cannot convert from int to
								// char
		System.out.println(ch1);// ?
		System.out.println(ch2);//
	}

}
