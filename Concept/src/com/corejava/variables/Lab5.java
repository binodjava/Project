package com.corejava.variables;

public class Lab5 {
	int a;
	public static void main(String[] args) {
		//System.out.println(a);//Cannot make a static reference to the non-static field a
		System.out.println(new Lab5().a);
		
	}

}
