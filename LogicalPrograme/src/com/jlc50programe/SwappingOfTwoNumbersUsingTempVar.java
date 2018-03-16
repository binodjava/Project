package com.jlc50programe;

import java.util.Scanner;

public class SwappingOfTwoNumbersUsingTempVar {
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b vlaue :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap a=" + a + " b=" + b);
		
		//Logic 1:
		/*temp = a;
		a = b;
		b = temp;*/
		
		//Logic 2:
		temp=b;
		b=a;
		a=temp;
		
		
		
		System.out.println("After swap a=" + a + " b=" + b);

		sc.close();

	}

}
