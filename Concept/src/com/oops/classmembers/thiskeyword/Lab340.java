package com.oops.classmembers.thiskeyword;

public class Lab340 {
	public static void main(String[] args) {
		Hello1 h = new Hello1();
		h.show();

	}

}

class Hello1 {
	int a = 10;

	void show() {
		String a = "JLC";
		System.out.println(a);//JLC
		System.out.println(this.a);//10
	}
}

