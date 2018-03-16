package com.calender;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the year");
		int year = sc.nextInt();

		// Logic:1
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);

		// for 1st day
		cal.set(Calendar.DAY_OF_YEAR, 1);
		System.out.println(cal.getTime().toString());

		// for last day
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			cal.set(Calendar.DAY_OF_YEAR, 366); // for leap years
			System.out.println(cal.getTime().toString());

		} else {
			cal.set(Calendar.DAY_OF_YEAR, 365); // for leap years
			System.out.println(cal.getTime().toString());

		}
		sc.close();
	}

}
