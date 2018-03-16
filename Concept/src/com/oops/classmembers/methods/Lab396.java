package com.oops.classmembers.methods;

public class Lab396 {
	public static void main(String[] args) {
		int a = 99;
		Hello41 h = new Hello41();
		System.out.println("Main begin :" + a);
		h.m1(a);
		System.out.println("Main ends :" + a);

	}

}

class Hello41 {
	void m1(int a) {
		System.out.println("M1 begin :" + a);
		a = a + 10;
		System.out.println("M1 ends :" + a);
	}
}


/*Main begin :99
M1 begin :99
M1 ends :109
Main ends :99*/

