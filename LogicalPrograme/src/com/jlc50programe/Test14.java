package com.jlc50programe;

import java.util.Scanner;

//Q. Wtap to display number of digits in given number?
public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		
		while(n!=0){
			int digit =n%10;
			System.out.println(digit);
			n=n/10;
		}

		sc.close();
	}

}