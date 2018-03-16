package com.oops.classmembers.localblocks;

public class Lab325 {
	public static void main(String[] args) {
		Hello2 h = new Hello2();
		System.out.println("Main :" + h.a);//a cannot be resolved or is not a field
//		a is local var, can't be use outside of block

	}

}

class Hello2 {
	{
		int a = 10;
		String str = "JLC";
		System.out.println("Block :" + a);
	}
}
