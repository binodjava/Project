package com.jlc50programe;

import java.util.Scanner;

//Q. Wtap to find the sum of fisrt n ODD numbers
public class Test11 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0)
				sum = sum + i;
		}
		System.out.println("Sum of odd number is :" + sum);
		sc.close();
	}
}
