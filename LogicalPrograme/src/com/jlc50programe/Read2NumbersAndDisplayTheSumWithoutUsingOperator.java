package com.jlc50programe;

import java.util.Scanner;

public class Read2NumbersAndDisplayTheSumWithoutUsingOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b vlaue :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int carry;
		
		while(b!=0){
			carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		
		System.out.println("Sum is :"+a);
	}

}
