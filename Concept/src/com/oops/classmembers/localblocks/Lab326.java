package com.oops.classmembers.localblocks;

public class Lab326 {
	public static void main(String[] args) {
		System.out.println("I am main()");

		{
			int a = 10;
			System.out.println("I am local block I in main() :" + a);
		}
		{
			int a = 20;
			System.out.println("I am local block II in main() :" + a);
		}
		{
			String a = "JLC";
			System.out.println("I am local block III in main() :" + a);
		}

	}

}



/*
I am main()
I am local block I in main() :10
I am local block II in main() :20
I am local block III in main() :JLC*/







