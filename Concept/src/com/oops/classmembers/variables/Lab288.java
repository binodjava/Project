package com.oops.classmembers.variables;

public class Lab288 {
	public static void main(String[] args) {

		Hello1 h1 = new Hello1();
		Hello1 h2 = new Hello1();
		System.out.println(h1.a + "\t" + h2.a);//0 0
		h1.a = 99;
		System.out.println(h1.a + "\t" + h2.a);// 99 0
	}

}

class Hello1 {
	int a;
}

/*0	0
99	0*/