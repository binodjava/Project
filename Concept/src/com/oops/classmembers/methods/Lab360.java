package com.oops.classmembers.methods;

public class Lab360 {
	public static void main(String[] args) {
		Hello9 h = new Hello9();
		int a = h.show(10);
		System.out.println(a);//11

	}

}

class Hello9 {
	int show(int x) {
		return x + 1;
	}
}
