package com.oops.classmembers.localblocks;

public class Lab322 {
	public static void main(String[] args) {

		System.out.println("\n Main :" + Hello.a);
	}

}

class Hello {
	static int a;
	{
		System.out.println("\nI am IIB");
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

Main :0*/