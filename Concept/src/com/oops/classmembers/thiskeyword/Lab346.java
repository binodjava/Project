package com.oops.classmembers.thiskeyword;

public class Lab346 {
	public static void main(String[] args) {
		Hello5 h = new Hello5();

	}

}

class Hello5 {
	Hello5() {
		this(10);//calling 1-args constructor
//		Recursive constructor invocation Hello5(int)
	}

	Hello5(int a) {
		this();//calling default constructor
//		Recursive constructor invocation Hello5()
	}
}


//Recursive constructor invocation Hello5()
//is not allowed in java


