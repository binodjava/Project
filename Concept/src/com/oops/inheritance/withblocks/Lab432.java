package com.oops.inheritance.withblocks;

public class Lab432 {
	public static void main(String[] args) {
		System.out.println(Hello3.a);
		
		
		
		/*Output:-
		Hai->SB
		99
		
*/
//same like Lab431
	}

}

class Hai3 {
	static int a = 99;
	static {
		System.out.println("Hai->SB");
	}
}

class Hello3 extends Hai3 {
	static {
		System.out.println("Hello->SB");
	}
}