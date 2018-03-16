package com.oops.classmembers.thiskeyword;

public class Lab339 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.show();
	}

}

class Hello {
	int a = 10;
	void show() {
		String a = "JLC";
		System.out.println(a);//JLC
		System.out.println(a);//JLC
	}
}

//1st JVM will check var is defined under method or not, if not then it will 
//check at class level
//if you want to access class level var have to use this keyword
