package com.oops.inheritance.withconstructors;

public class Lab439 {
	public static void main(String[] args) {
		new C2();

	}

}


/*A->S.B
B->S.B
C->S.B
A->I.B
A->D.C
B->I.B
B->D.C
C->I.B
C->D.C
*/

/*Execution will be like this:-
1: static block will get executed
2: Instance Block will get executed
3: Default constructor get executed*/






class A2 {
	A2() {
		System.out.println("A->D.C");
	}

	static {
		System.out.println("A->S.B");
	}
	{
		System.out.println("A->I.B");
	}
}

class B2 extends A2 {
	B2() {
		System.out.println("B->D.C");
	}

	static {
		System.out.println("B->S.B");
	}
	{
		System.out.println("B->I.B");
	}
}

class C2 extends B2 {
	C2() {
		System.out.println("C->D.C");
	}

	static {
		System.out.println("C->S.B");
	}
	{
		System.out.println("C->I.B");
	}
}
