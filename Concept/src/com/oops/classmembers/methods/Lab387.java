package com.oops.classmembers.methods;

public class Lab387 {
	public static void main(String[] args) {
		Hello34 h = new Hello34();
		byte b = 20;
		h.add(b, 10);
		h.add(b, b);
	}

}

class Hello34 {
	void add(byte a, int b) {
		System.out.println("add(byte,int)");
	}
}


/*add(byte,int)
add(byte,int)
*/



