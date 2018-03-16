package com.companies.godigit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//Using Collection Interface


public class ReverseString4{
	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		//Logic starts
		char[] ch1=input.toCharArray();
		List<Character> list=new LinkedList<>();
		for(char c:ch1){
			list.add(c);
		}
		Collections.reverse(list);
		ListIterator<Character> li=list.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
		

		
		
		
		
		
		scan.close();
	}

}
