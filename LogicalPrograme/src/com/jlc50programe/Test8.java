package com.jlc50programe;

import java.io.IOException;
import java.util.Scanner;

//Q. Wtap to read a char and check the following
//a)Upper case alphabet
//b)Lower case alphabet
//c)Digit
//d)Special Char

public class Test8 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char :");
		char ch=sc.next().charAt(0);//To read the char
//		char ch = (char) System.in.read(); [only for char not for int]

		
		//a)Upper case alphabet
		if (ch >= 65 && ch <= 90) {
			System.out.println("Character is Upper case :" + ch);
			
		//b)Lower case alphabet
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("Character is Lower case :" + ch);
			
		//c)Digit
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("Character is Digit :" + ch);
			
		//d)Special Char
		} else {
			System.out.println("Character is Special Character :" + ch);
		}

	}

}
