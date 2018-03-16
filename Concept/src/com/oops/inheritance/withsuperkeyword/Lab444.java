package com.oops.inheritance.withsuperkeyword;

public class Lab444 {
	public static void main(String[] args) {
		Hello4.show();

	}

}

class Hai4 {
	static int a = 10;

}

class Hello4 extends Hai4 {
	static int a = 20;

	static void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(Hello4.a);
		System.out.println(Hai4.a);
	}
}


/*30
20
10*/
