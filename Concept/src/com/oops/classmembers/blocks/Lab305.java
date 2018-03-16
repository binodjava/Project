package com.oops.classmembers.blocks;

public class Lab305 {
	public static void main(String[] args) {
		System.out.println(Hello5.a);
		System.out.println(Hello5.a);

	}

}

class Hello5 {
	static int a = 10;
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
}

/*Static Block
10
10*/