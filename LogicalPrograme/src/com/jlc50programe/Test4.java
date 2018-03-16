package com.jlc50programe;

import java.util.Scanner;

//Q. Wtap to read two numbers and display its quotient without using / Operator
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers for division :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quotient = 0;

		while (a >= b) {
			a = a - b;
			quotient++;
		}
		System.out.println("Quotient is :" + quotient);

	}

}
