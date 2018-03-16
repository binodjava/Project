package com.oops.classmembers.variables;

public class Lab287 {
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.a);//0
		h.a = 99;
		System.out.println(h.a);//99
	}

}

class Hello {
	int a;
}

/*when we create object default constructor is called by jvm and initializes the variables 
 * with its default value.
*/