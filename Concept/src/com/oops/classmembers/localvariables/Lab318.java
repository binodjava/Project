package com.oops.classmembers.localvariables;

public class Lab318 {
	public static void main(String[] args) {

		Hello7 h = new Hello7();
	}

}

class Hello7 {
	{
		int a = 10;
		System.out.println("Block I :" + a);
	}
	{
		String a = "BK";
		System.out.println("Block II :" + a);
	}

}

/*Block I :10
Block II :BK*/
