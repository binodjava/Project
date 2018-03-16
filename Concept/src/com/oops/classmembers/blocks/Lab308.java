package com.oops.classmembers.blocks;

public class Lab308 {
	public static void main(String[] args) {
		Hello8 h = new Hello8();
		new Hello8();

	}

}

class Hello8 {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
}


/*Static Block
Instance Block
Instance Block

*at every object creations instance block will be executed
*
*
*/