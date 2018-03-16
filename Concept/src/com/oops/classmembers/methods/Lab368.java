package com.oops.classmembers.methods;

public class Lab368 {
	public static void main(String[] args) {
		Hello17 h = new Hello17();
		System.out.println(h.show(10));
	}

}

class Hello17 {
	long show(int x) {
		System.out.println("show()");
		return x + 1;
	}

}

/*OUTPUT:-
show()
11*/
