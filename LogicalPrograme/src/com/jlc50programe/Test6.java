package com.jlc50programe;

import java.util.Scanner;

//Q. Wtap to print N Natural Numbers:-
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		if (n >= 1) {
			for (int i = 0; i <= n; i++)
				System.out.println(i + " ");
		}
		sc.close();
	}

}
