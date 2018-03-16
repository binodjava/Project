package com.companies.godigit;

public class MultiplyTwoNumbersUsingRecursion {

	static int multiply(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		} else {
			if (b == 1) {
				return a;
			} else {
				return a + (multiply(a, b - 1));
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(MultiplyTwoNumbersUsingRecursion.multiply(1, 30));

	}

}
