package com.companies.godigit;

import java.util.Scanner;


/*Pseudo Code for Reverse String Method 3:

1. Convert the input string into character array by using the toCharArray() built in method of the String Class .
2. In this method we will scan the character array from both sides , that is from the start index (left) as well as from last 
index(right) simultaneously.
3. Set the left index equal to 0 and right index equal to the length of the string -1.
4. Swap the characters of the start index scanning with the last index scanning  one by one .After that  increase the 
left index by 1 (left++) and decrease the right by 1 i.e (right--) to move on to the next characters in the character array .
5. Continue till left is less than or equal to the right .*/


public class ReverseString3 {
	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		//Logic starts
		char[] ch1=input.toCharArray();
		int left,right=ch1.length-1;
		
		//Swapping value of left and right
		for(left=0;left<right;left++,right--){
			char temp=ch1[left];
			ch1[left]=ch1[right];
			ch1[right]=temp;
		}
		for(char c:ch1){
			System.out.print(c);
			
		}
		
		
		
		scan.close();
	}

}
