package com.oops.classmembers.methods;

public class Lab362 {
	public static void main(String[] args) {
		Hello11 h=new Hello11();
		h.show(10);
		System.out.println("Hello!!!");
	}
}

class Hello11 {
	int show(int x) {
		return x + 1;
	}
}

/*OUTPUT: Hello!!!
B'Coz: we're calling method and got return type as 11 but not using method return type value.
		so just simple SOP will print.*/