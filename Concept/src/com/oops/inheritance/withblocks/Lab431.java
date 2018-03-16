package com.oops.inheritance.withblocks;

public class Lab431 {
	public static void main(String[] args) {
		System.out.println(Hai2.a);

		/*
		 * Output:- Hai->SB : 99
		 */
		// Since only parent class is loading, so parent class static block
		// weill get executed

	}

}

class Hai2 {
	static int a = 99;
	static {
		System.out.println("Hai->SB :");
	}
}

class Hello2 extends Hai2 {
	static {
		System.out.println("Hello->SB");
	}
}
