package com.oops.classmembers.blocks;

public class Lab306 {
	public static void main(String[] args) {
		Hello6 h=null;
		System.out.println("Ref Created");

	}

}
//Output: Ref Created
//Class is loading only when we call static var or creating object
//Here class is not loading


class Hello6 {
	static int a = 10;
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
}
