package com.oops.classmembers.localblocks;

public class Lab323 {
	public static void main(String[] args) {

		new Hello1();
		System.out.println("\n**Hello Guys");
	}

}

class Hello1 {
	static int a;
	{
		System.out.println("\n I am IIB");
		{
			System.out.println("I am local block in IIB");
		}
	}
	static {
		System.out.println("\n I am SIB");
		{
			System.out.println("I am local block in SIB");
		}
	}
}


/*I am SIB
I am local block in SIB

I am IIB
I am local block in IIB

**Hello Guys*/
