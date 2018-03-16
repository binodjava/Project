package com.oops.classmembers.methods;

public class Lab407 {
	public static void main(String[] args) {
		Hello52 h = new Hello52();
		h.show(10);
	}

}

class Hello52 {
	void show(int... arr1) {//Duplicate method show(int...) in type Hello52
		System.out.println("\nshow(int...)");
	}

	void show(int[] arr1) {
		System.out.println("\nshow(int[])");
	}
}
