package com.oops.classmembers.methods;

public class Lab416 {
	public static void main(String[] args) {
		System.out.println("Lab416-main");

	}


class Prince {
	public static void main(String[] args) {//The method main cannot be declared static; static methods can only be declared in a static or top level type
		
	}
		System.out.println("Prince-main()");
		Lab416.main(args);
	}
}
