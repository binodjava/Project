package com.calender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FindNewYearDayOfGivenYear {
	public static void main(String[] args) {
		int year, day=0, n;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter the year between 1800 to 2400");
		year = sc.nextInt();
		/*	
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			n = 1;
		} else {
			n = 0;
		}
		day =+ n;*/
		
		
		
		
		 Calendar cal = new GregorianCalendar();
	     cal.set(Calendar.DAY_OF_YEAR, 1);
	     System.out.println(cal.getTime().toString());
	     cal.set(Calendar.DAY_OF_YEAR, 366); // for leap years
	     System.out.println(cal.getTime().toString());
	     
		
		
		
		
		
		
		
		
	/*	
		switch(day){  
	    case 0: System.out.println("Sunday");break;  
	    case 1: System.out.println("Monday");break;  
	    case 2: System.out.println("Tuesday");break;  
	    case 3: System.out.println("Wednesday");break;  
	    case 4: System.out.println("Thursday");break;  
	    case 5: System.out.println("Friday");break;  
	    case 6: System.out.println("Saturday");break; 
	    default:System.out.println("Logic is not currect");  
	    } 
*/
		
		
		sc.close();
	}
}
