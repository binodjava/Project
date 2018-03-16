package com.oops.classmembers.variables;

public class Lab295 {
	public static void main(String[] args) {
		System.out.println(Hai2.b);// Static var can be access by class name also along with object ref
//		which contains real object not null ref.
	}

}

class Hai2 {
	static int b;
}
