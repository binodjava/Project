package com.oops.assessmodifiers.p3;

public class Lab490 {
	public static void main(String[] args) {
		A3 aobj = new A3(99);
		aobj.show();//99
	}

}

class A3 {
	private int x;

	public A3(int x) {
		this.x = x;
	}

	void show() {
		System.out.println(x);
	}
}
