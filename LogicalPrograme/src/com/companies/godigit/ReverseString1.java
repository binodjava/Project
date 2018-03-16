package com.companies.godigit;

import java.util.Scanner;

//This logic is for reverse whole string
/*
 * Points to Keep in Mind Before attempting the Solution:

1. String class in java do not have reverse() method , StringBuilder class does have built in reverse() method.
2. StringBuilder class do not have toCharArray() method , while String class does have toCharArray() method.
*/

public class ReverseString1 {
	public static void main(String[] args) {
		String input="";
		System.out.println("Please enter the string");
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		char[] ch1=input.toCharArray();
		for(int i=ch1.length-1;i>=0;i--){
			System.out.print(ch1[i]);
		}
		
		
		scan.close();
	}

}
