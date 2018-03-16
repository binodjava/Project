package com.oops.classmembers.variables;

public class Lab290 {
	public static void main(String[] args) {

		Hello3 h = null;
		System.out.println(h.a);//Null pointer access: The variable h can only be null at this location
	//java.lang.NullPointerEx at 7
//		Why? instance variable can be accessed by object ref only, which contains real object
//		only static var can be access by either object ref contains null OR real object
	}

}

class Hello3 {
	int a;
}