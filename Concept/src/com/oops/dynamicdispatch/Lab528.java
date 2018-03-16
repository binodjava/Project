package com.oops.dynamicdispatch;

public class Lab528 {
	public static void main(String[] args) {
		C5 c = new C5();
		
		c.show();
		/*J
		false
		JLC
		99*/
		

		c.x = true;
		B5 b = c;
		b.x = "SRI";
		A5 a = c;
		a.x = 88;
		c.show();
		
		/*J
		true
		SRI
		88*/

	}

}

class A5 {
	int x = 99;
}

class B5 extends A5 {
	String x = "JLC";
}

class C5 extends B5 {
	boolean x = false;

	void show() {
		char x = 'J';
		System.out.println(x);
		C5 cref = this;
		B5 bref = this;
		A5 aref = this;
		System.out.println(cref.x);
		System.out.println(bref.x);
		System.out.println(aref.x);

	}
}
