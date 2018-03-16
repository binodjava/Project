package com.oops.classmembers.localvariables;

public class Lab319 {
	public static void main(String[] args) {
		Hello8 h = new Hello8();
	}

}

class Hello8 {
	int a = 10;
	{
		System.out.println("Block I :" + a);
	}
	{
		System.out.println("Block II :" + a);
	}
}

/*Block I :10
Block II :10*/
