package com.companies.godigit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//Using Collection Interface
/*Pseudo Code for Reverse String Method 5 :

1. The last method is converting string into bytes .  getBytes()  method  is used to convert the input string into bytes[].
2. Then we will create a temporary byte[]  of length equal to the length of the input string.
3. We will store the bytes(which we get by using getBytes() method) in reverse order   into the temporary byte[] .
*/
public class ReverseString5{
	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		//Logic starts
		byte[] strAsByteArray=input.getBytes();
		byte[] result=new byte[strAsByteArray.length];
		
		//iterating the bytes
		for(int i=0;i<strAsByteArray.length;i++){
			result[i]=strAsByteArray[strAsByteArray.length-1-i];
		}
		
		System.out.print(new String(result));
		

		
		
		
		
		
		scan.close();
	}

}
