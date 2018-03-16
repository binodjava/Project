package com.oops.classmembers.methods;

public class Lab363 {
	public static void main(String[] args) {
		Hello12 h=new Hello12();
		System.out.println(h.show(10));//The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
//		SOP expect some return type, but methos doesn't have return type
	}
}

class Hello12 {
	void show(int x) {
		System.out.println("show()");
	}
}
