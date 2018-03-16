package com.calender;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please!!! Enter the year");
		int year = sc.nextInt();
		boolean leap = false;

		/*1st Logic
		  if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;*/

		//2nd Logic
	/*	if (year % 100 == 0) {
			if (year % 400 == 0)
				leap = true;
			else
				leap = false;

		} else {
			if (year % 4 == 0)
				leap = true;
			else
				leap = false;
		}
		
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");*/
		
		
		   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
               System.out.println("Year " + year + " is a leap year");
		   else
               System.out.println("Year " + year + " is not a leap year");
		
		
		
		
		
		
		
		
		
	}
}
