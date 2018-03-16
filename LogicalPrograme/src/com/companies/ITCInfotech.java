package com.companies;

import java.util.Scanner;

/*Find the number whose square and square of reverse number will be reverse

 (A)Test Case 1:
 11 square =121
 11 square =121

 (B)Test Case 2:
 12 square=144
 21 square =441

 (C)Test Case 3:
 13 square=169
 31 square=961

 *
 */

public class ITCInfotech {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = sc.nextInt();
		int a, rev1 = 0, rev2 = 0, sqr1, sqr2, digit;
		a = n;
		sqr1 = n * n;
		// Reverse of n
		while (n > 0) {
			digit = n % 10;
			rev1 = rev1 * 10 + digit;
			n = n / 10;
		}// end of reverse
		sqr2 = rev1 * rev1;
		// Reverse of sqr2
		while (sqr2 > 0) {
			digit = sqr2 % 10;
			rev2 = rev2 * 10 + digit;
			sqr2 = sqr2 / 10;
		}// end of logic

		if (sqr1 == rev2) {
			System.out.println(a + " is a required number");
		} else {
			System.out.println(a + " is not a required number");
		}

	}

}
