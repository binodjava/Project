package com.oops.classmembers.methods;

public class Lab404 {
	public static void main(String[] args) {
		Hello49 h = new Hello49();
		h.show(10);
		h.show(10, 20);
		h.show(10, 20, 30);
// Through array, we can pass only array.
// But through var-args, we can pass array as well as nornal values

	}

}

class Hello49 {
	void show(int a, int... arr) {
		System.out.println("\nshow(int, int...)");
	}
}

/*OUTPUT:-

show(int, int...)

show(int, int...)

show(int, int...)
*/