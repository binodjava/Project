package com.oops.classmembers.localvariables;

public class Lab317 {
	public static void main(String[] args) {
		System.out.println("Main :" + Hello6.a);
	}

}

class Hello6 {
	static int a = 10;
	static {
		System.out.println("S Block 1:" + a);
	}
	static {
		System.out.println("S Block 2:" + a);
	}

}

/*S Block 1:10
S Block 2:10
Main :10*/
