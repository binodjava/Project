package com.oops.classmembers.thiskeyword;

public class Lab344 {
	public static void main(String[] args) {
		Hello3 h = new Hello3(99);
		h.show();

	}

}

class Hello3 {
	int a;

	Hello3() {
		System.out.println("Hello DC");
	}

	Hello3(int a) {
		this();
		System.out.println("Hello 1-Args Constructor");
		this.a = a;
	}

	void show() {
		System.out.println(a);
	}
}


/*Hello DC
Hello 1-Args Constructor
99
*/