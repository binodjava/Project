package com.jlc50programe;

import java.util.Scanner;

public class SwappingOfTwoNumberWithoutTempVar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b value :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap a=" + a + " b=" + b);
		sc.close();

	}

}
