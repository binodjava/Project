package com.oops.classmembers.blocks;

public class Lab307 {
	public static void main(String[] args) {
		Hello7 h=null;
		System.out.println("Ref Created");
		h=new Hello7();

	}

}

class Hello7 {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
}
/*
Ref Created
Static Block
Instance Block*/