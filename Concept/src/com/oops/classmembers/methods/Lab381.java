package com.oops.classmembers.methods;

public class Lab381 {
	public static void main(String[] args) {
		Hello28 h = new Hello28();
		h.show((char) 65);//show(char)
	}

}

class Hello28 {
	void show(char x) {
		System.out.println("show(char)");
	}
}