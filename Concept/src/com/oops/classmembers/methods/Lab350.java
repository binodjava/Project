package com.oops.classmembers.methods;

public class Lab350 {
	public static void main(String[] args) {
		Hello3.show();//show()
//static method can be called by class name or
//or object ref contains null
	}

}

class Hello3 {
	static void show() {
		System.out.println("show()");
	}
}
