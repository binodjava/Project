package com.corejava.controlstatements;

public class Lab169 {
	public static void main(String[] args) {
		int a = 0;
		if (a++ == 0)
			System.out.println("ZERO");
		else if (a++ == 1)
			System.out.println("ONE");
		else
			System.out.println("Not Matching");
		System.out.println(a);

	}

}

/*OUTPUT:
 * ZERO
 * 1
 * 
 * if no condition is matching, then it will print else statement
 * 
 * 
 */
