package com.jlc50programe;

import java.util.Scanner;

//Wtap to print sum of first n even numbers
public class Test13 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
			if (i % 2 == 0)
				sum = sum + i;
		System.out.println("Sum of even no is :" + sum);
		sc.close();
	}

}