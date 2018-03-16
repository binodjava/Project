package com.jlc50programe;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		int edigit = 0, odigit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();

		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 == 0)
				edigit++;
			else
				odigit++;
			n = n / 10;
		}

		System.out.println("Total number of Even Digit :" + edigit);
		System.out.println("Total number of ODD Digit :" + odigit);

		sc.close();

	}

}
