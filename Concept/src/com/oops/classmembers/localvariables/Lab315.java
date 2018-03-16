package com.oops.classmembers.localvariables;

public class Lab315 {
	public static void main(String[] args) {
		System.out.println("Main :" + Hello4.a);
	}

}

class Hello4 {
	static int a;
	static {
		final int b = 20;
		System.out.println(a);
		System.out.println(b);
	}

}
/*
0
20
Main :0*/