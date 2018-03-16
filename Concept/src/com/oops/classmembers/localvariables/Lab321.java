package com.oops.classmembers.localvariables;

public class Lab321 {
	public static void main(String[] args) {

		System.out.println("Main :" + Hello10.a);//a cannot be resolved or is not a field
//		 same, a is local var, outside of block we can't use it.
	}

}

class Hello10 {
	static {
		int a = 10;
		System.out.println(" Block :" + a);
	}
}
