package com.oops.classmembers.methods;

public class Lab385 {
	public static void main(String[] args) {
		Hello32 h = new Hello32();
		String a = h.add(99, "JLC");
		System.out.println(a);
		String b = h.add("JLC", 99);
		System.out.println(b);
	}

}

class Hello32 {
	String add(int b, String a) {
		System.out.println("add(int,String)");
		return a + b;
	}

	String add(String a, int b) {
		System.out.println("add(String,int");
		return a + b;
	}
}



/*add(int,String)
JLC99
add(String,int
JLC99*/











