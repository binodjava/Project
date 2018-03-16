package com.oops.methodoverriding;

public class Lab496 {
	public static void main(String[] args) {

	}

}

class A2 {
	long show() {
		return 0;
	}
}

class B2 extends A2 {
	int show() {//return type should be compatible type,int->long not possible
		return 0;
	}
}
