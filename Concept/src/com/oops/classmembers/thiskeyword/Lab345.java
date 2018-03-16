package com.oops.classmembers.thiskeyword;

public class Lab345 {
	public static void main(String[] args) {
		Hello4 h = new Hello4();
	}

}

class Hello4 {
	Hello4() {
		this();//Recursive constructor invocation Hello4()

	}
}

//we're calling default constructor from default constructor.
//that is not possibe


