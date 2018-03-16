package com.companies;

import java.util.Scanner;

public class Mindtree {
	static String st4 = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first STRING ");
		String st1 = sc.nextLine();
		System.out.println("Please enter the second STRING ");
		String st2 = sc.nextLine();
		char[] ch1 = st1.toCharArray();
		char[] ch2 = st2.toCharArray();
		//int max=Math.max(ch1.length, ch2.length);
		for (int i = 0; i <ch1.length; i++) {
			for (int j = i; j<=i; j++) {
				String st3 = Character.toString(ch1[i])+ Character.toString(ch2[j]);
				st4 = st4 + st3;
			}

		}
		System.out.println("Output is :" + st4);
	}

}
