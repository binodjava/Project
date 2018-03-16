package com.jlc50programe;

import java.util.Scanner;

//Q. Wtap to read two numbers and display its remainder without using % Operator
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int rem = a - (a / b) * b;

		System.out.println("Remainder is :" + rem);

	}

}
