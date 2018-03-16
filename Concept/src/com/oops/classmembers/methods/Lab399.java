package com.oops.classmembers.methods;

public class Lab399 {
	public static void main(String[] args) {
		Hello44 h = new Hello44();
		h.sum(12, 23);

	}

}

class Hello44 {
	void sum(int a, int b) {
		System.out.println("sum(int, int)");
		System.out.println(a + b);
	}
}

/*OUTPUT:
	sum(int, int)
	35*/
