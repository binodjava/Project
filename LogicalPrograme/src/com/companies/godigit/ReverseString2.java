package com.companies.godigit;

import java.util.Scanner;

//This logic is for reverse whole string
/*
 1.  In the second method , we will use the built in reverse() method of the StringBuilder class ,.
 
Note :  String class does not have reverse() method . So we need to convert the input string to StringBuilder , 
which is achieved by using the append method of the StringBuilder.
2.  After that print out the characters of the reversed string  by scanning from the first till the last index.
*/

public class ReverseString2 {
	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		//Logic starts
		StringBuilder sb=new StringBuilder();
		sb.append(input);
		sb=sb.reverse();//end
		
		System.out.println(sb);
		//iterating for string using chararray
		System.out.println("--------------------------");
		for(int i=0;i<sb.length();i++){
			System.out.print(sb.charAt(i));
		}
		
		
		scan.close();
	}

}
