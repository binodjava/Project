package com.oops.inheritance.withblocks;

public class Lab430 {
	public static void main(String[] args) {
		System.out.println(Hello1.a);
		
		/*Output:-
		Hai->SB
		Hello->SB
		99*/

		

	}

}

class Hai1 {
	static {
		System.out.println("Hai->SB");
	}
}

class Hello1 extends Hai1 {
	static int a = 99;
	static {
		System.out.println("Hello->SB");
	}
}
