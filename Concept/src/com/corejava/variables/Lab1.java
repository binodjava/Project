package com.corejava.variables;

class Hello {
	boolean b1;
	byte b2;
	short s;
	int a;
	long b;
	float f;
	double d;
	String str;
	Hello h;

	// Illegal modifier for the class Hello; only public, abstract & final are
	// permitted
	// In case of public: The public type Hello must be defined in its own file (i.e in one class only public class will be present)
	//i.e main class
	//Non-static var can't be used from static context
	//but static var can be used from static as well as non-static context
	void show() {
		System.out.println("boolean : " + b1); //boolean : false
		System.out.println("byte : " + b2); // byte : 0
		System.out.println("short : " + s); // short : 0
		System.out.println("int : " + a); //  int : 0
		System.out.println("long : " + b); // long : 0
		System.out.println("float : " + f); // float : 0.0
		System.out.println("double : " + d); // double : 0.0
		System.out.println("String : " + str); // String : null
		System.out.println("Hello : " + h); // Hello : null
	}
}

public class Lab1 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.show();

	}

}
