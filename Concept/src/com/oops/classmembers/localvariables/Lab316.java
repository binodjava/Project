package com.oops.classmembers.localvariables;

public class Lab316 {
	public static void main(String[] args) {
		Hello5 h = new Hello5();
		System.out.println("Main :" + h.a);
	}

}

class Hello5 {
	int a = 10;
	{
		System.out.println("1st Block :" + a);
	}
	{
		System.out.println("2nd Block :" + a);
	}
}

/*1st Block :10
2nd Block :10
Main :10*/
