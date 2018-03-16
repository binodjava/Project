package com.oops.classmembers.methods;

public class Lab403 {
	public static void main(String[] args) {
		Hello48 h = new Hello48();
		h.show(a, arr);// need to pass value for 'a' and 'arr'
	}

}

class Hello48 {
	void show(int a, int... arr) {
		System.out.println("\nshow(int,int...)");
	}
}
