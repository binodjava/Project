package com.oops.assessmodifiers.p3;

import com.oops.assessmodifiers.p1.A;

public class Lab488 {
	public static void main(String[] args) {

		A1 aobj = new A1();
		aobj.x = 99;
		System.out.println(aobj.x);// Private
	}

}

class A1 {
	private int x;
}