package com.oops.classmembers.variables;

public class Lab289 {
	public static void main(String[] args) {
		
		new Hello2().a=99;// a is assigned by 99
		System.out.println(new Hello2().a);//0 [a has been assigned by its default values]
	}

}

class Hello2{
	int a;
}

//at every object creation, all variables gets initialized by its default values.