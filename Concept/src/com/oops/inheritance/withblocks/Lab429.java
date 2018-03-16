package com.oops.inheritance.withblocks;

public class Lab429 {
	public static void main(String[] args) {
		new Hello();
		
		/*OUTPUT:-
		Hai-> SB :99
		Hello->SB :99
		Hello->SB :88*/
		
	}

}

class Hai {
	static int a = 99;
	static {
		System.out.println("Hai-> SB :" + a);
	}
}

class Hello extends Hai {
	static int b = 88;
	static {
		System.out.println("Hello->SB :" + a);
		System.out.println("Hello->SB :" + b);
	}
}