package com.oops.classmembers.methods;

public class Lab373 {
	public static void main(String[] args) {
		Hello22 h = new Hello22();
		System.out.println(h.isDigit('A'));
		System.out.println(h.isDigit('8'));
	}

}

class Hello22 {
	boolean isDigit(char ch) {
		System.out.println("isDigit() :" + ch);
		if (ch >= 48 && ch <= 57)
			return true;
		else
			return false;
	}
}

//2 times methods call is done
/*isDigit() :A
false
isDigit() :8
true
*/











