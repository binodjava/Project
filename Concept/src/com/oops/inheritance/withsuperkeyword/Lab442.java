package com.oops.inheritance.withsuperkeyword;

public class Lab442 {
	public static void main(String[] args) {
		Hello2 h = new Hello2();
		h.show();
	}

}

/*30
20
10
*/

class Hai2 {
	static int a = 10;
}

class Hello2 extends Hai2 {
	static int a = 20;

	void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);// The static field Hello2.a should be
									// accessed in a static way
		System.out.println(super.a);// The static field Hai2.a should be
									// accessed in a static way

		/*System.out.println(a);
		System.out.println(Hello2.a);
		System.out.println(Hai2.a);*/
	}
}
