package com.oops.classmembers.methods;

public class Lab349 {
	public static void main(String[] args) {
		Hello h = null;
		h.show();//java.lang.NullPointerException
	}

}

class Hello2 {
	void show() {
		System.out.println("show()");
	}
}
//Instance method can be called by object ref whose contains object



