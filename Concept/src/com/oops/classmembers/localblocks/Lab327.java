package com.oops.classmembers.localblocks;

public class Lab327 {
	public static void main(String[] args) {
		System.out.println("I am main()");
		int a = 90;
		{
			int a = 10;//Duplicate local variable a
			System.out.println("I am local blok I in main() :" + a);
//			inside block outside var also can be accessed, so compiler is confused actually which 
//			have to use 
		}

	}

}
