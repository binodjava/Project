package com.oops.classmembers.methods;

public class Lab406 {
	public static void main(String[] args) {
		Hello51 h = new Hello51();
		h.show(10);//he method show(int[], int...) in the type Hello51 is not applicable for the arguments (int)

	}

}

class Hello51 {
	void show(int... arr1, int... arr) {//The variable argument type int of the method show must be the last parameter
		System.out.println("\nshow(int...,int...)");
	}
}
