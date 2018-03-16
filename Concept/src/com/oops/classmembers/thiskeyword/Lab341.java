package com.oops.classmembers.thiskeyword;

public class Lab341 {
	public static void main(String[] args) {
		Hello2 h = new Hello2();
		h.show();

	}

}

class Hello2 {
	int a = 10;
	static int b = 20;

	void show() {
		String a = "JLC";
		String b = "SD";
		System.out.println(a);// JLC
		System.out.println(b);// SD
		System.out.println(this.a);// 10
		System.out.println(this.b);// 20
	}

}
