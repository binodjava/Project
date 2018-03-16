package com.oops.methodoverriding;

public class Lab507 {
	public static void main(String[] args) {

	}

}

class A13 {
	void m1() {
	}
}

class B13 extends A13 {
	private void m1() {
	}// Cannot reduce the visibility of the inherited method from A13
//	default can be overridden with defaul/protected/puliblic cant't b private
//	can'treduce the visiblity
}
