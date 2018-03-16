package com.oops.classmembers.blocks;

public class Lab309 {
	public static void main(String[] args) {
		System.out.println("Main :" + Hello9.a);
		System.out.println(Hello9.b);

	}

}

class Hello9 {
	static int a;
	static int b;
	static {
		a = 10;
		b = 20;// instance var can't be access from sttic context
		System.out.println("Static Block");
	}
}

/*Static Block
Main :10
20
*/