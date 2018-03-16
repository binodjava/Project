package com.oops.classmembers.methods;

public class Lab392 {
	public static void main(String[] args) {
		Hello39 h = new Hello39();
		h.show(null);//The method show(String) is ambiguous for the type Hello39
	}

}

class Hello39 {
	void show(String str) {
		System.out.println("show(String)");
	}

	void show(Hello39 str) {
		System.out.println("show(Hello39)");
	}
}