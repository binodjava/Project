package com.oops.classmembers.localblocks;

public class Lab328 {
	public static void main(String[] args) {
		System.out.println("I am main()");

		{
			int a = 10;
			System.out.println("I am local block in main() :" + a);
		}
		int a = 90;
		System.out.println("I am main() :" + a);
	}

}

/*
I am main()
I am local block in main() :10
I am main() :90*/