package com.corejava.controlstatements;

public class Lab167 {
	public static void main(String[] args) {
		int a = 99;
		if (a == 99) {
			int b = 12;
			System.out.println(b);
			System.out.println(a);
		}
		System.out.println(a);
		System.out.println(b);//b cannot be resolved to a variable

	}

}

// Since 'b' has been defined inside if block, so we can use it inside if only
//outside of if block, there is no scopre for b
//if you want to se it outside, define b outside of if block