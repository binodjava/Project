package com.oops.dynamicdispatch;

public class Lab526 {
	public static void main(String[] args) {
		B3 b = new B3();
		b.show();

	}

}

class A3 {
	int x = 10;
}

class B3 extends A3 {
	String x = "JLC";

	void show() {
		B3 ref1 = this;
		A3 ref2 = this;
		System.out.println(ref1.x + "\t" + ref2.x);

	}
}

/*JLC	10
*/