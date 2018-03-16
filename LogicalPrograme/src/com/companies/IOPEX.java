package com.companies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Implement java classes to take Date in String format and return day of the week(Sunday, Monday...saturday) as a String.
 1.Should not use any Standard classes like Date	
 2.Give Importance to the Design and Modularity
 3.Write some Unit Test as part of the code
 *
 */

public class IOPEX {
	static String date;
	static Map<String, Integer> map;

	public static void main(String[] args) {
		
		//Defining var for months
		map=new HashMap<>();
		map.put("01", 0);
		map.put("02", 3);
		map.put("03", 3);
		map.put("04", 6);
		map.put("05", 1);
		map.put("06", 4);
		map.put("07", 6);
		map.put("08", 2);
		map.put("09", 5);
		map.put("10", 0);
		map.put("11", 3);
		map.put("12", 5);//end
		
		
		//Defining var for centuary
		
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any date in the format \"14/03/1897\" ");
		date=sc.nextLine();
		@SuppressWarnings("unused")
		char[] ch1=date.toCharArray();
		int number=(calyearrCode()+calmonthCode() + calcenturyCode()+caldateNumber()-calleapYearCode()) % 7;
		
		switch(number){  
	    case 0: System.out.println("Sunday");break;  
	    case 1: System.out.println("Monday");break;  
	    case 2: System.out.println("Tuesday");break;  
	    case 3: System.out.println("Wednesday");break;  
	    case 4: System.out.println("Thursday");break;  
	    case 5: System.out.println("Friday");break;  
	    case 6: System.out.println("Saturday");break; 
	    default:System.out.println("Logic is not currect");  
	    } 
		
	}

	static int calyearrCode() {
		int y = Integer.parseInt(date.substring(8));
		int y1 = (y + y / 4) % 7;
		return y1;
	}

	static int calmonthCode() {
		String m = date.substring(3, 5);
		int m1 = Integer.valueOf(((Map<String, Integer>) map).get(m));
		return m1;
	}


	static int calcenturyCode() {
		int x = Integer.parseInt(date.substring(6));
		
		if (x <= 1799)
			x = 4;
		else if (x <= 1899)
			x = 2;
		else if (x <= 1999)
			x = 0;
		else if (x <= 2099)
			x = 6;
		else if (x <= 2199)
			x = 4;

		else
			System.out.println("Not in given range");
		return x;

	}

	static int caldateNumber() {
		int d = Integer.parseInt(date.substring(0, 2));
		return d;
	}

	static int calleapYearCode() {
		@SuppressWarnings("unused")
		int year = Integer.parseInt(date.substring(6));
		/*
		 * if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) { if
		 * 
		 * return 8; } else { return 0; }
		 */
		return 0;

	}

	
	
}
