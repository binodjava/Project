package com.oops.inheritance.withblocks;

public class Lab433 {
	public static void main(String[] args) {
		new Hello4();
		
		/*Output:-
		Hai->IB :99
		Hello->IB :99
		Hello->IB :88*/


	}

}

class Hai4 {
	int a = 99;
	{
		System.out.println("Hai->IB :" + a);
	}
}

class Hello4 extends Hai4 {
	int b = 88;
	{
		System.out.println("Hello->IB :" + a);
		System.out.println("Hello->IB :" + b);
	}
}