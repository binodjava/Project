package com.companies.godigit;

import java.util.Scanner;

public class ReverseEachWordInString1 {
	public static void main(String[] args) {
		System.out.println("enter the string ...!");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		// starts
		String[] words = str.split(" ");
		String reverseString = "";

		//Loop for iterating each word from string
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";

			//Loop for reversing the each word
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("Input string is : " + str);
		System.out.println("outut string is : " + reverseString);

		scan.close();

	}

}
