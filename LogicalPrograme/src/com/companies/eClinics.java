package com.companies;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class eClinics {
	public static void main(String[] args) throws ParseException {
		/*SimpleDateFormat originalFormat = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat targetFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date;
		try {
			date = originalFormat.parse("21/6/2013");
			System.out.println("Old Format :   " + originalFormat.format(date));
			System.out.println("New Format :   " + targetFormat.format(date));
			System.out.println("New Format :   " + targetFormat1.format(date));

		} catch (ParseException ex) {
			// Handle Exception.
		}*/
		
		
		/*
		1. Date Format with MM/dd/yyyy : 02/20/2018
		2. Date Format with dd-M-yyyy hh:mm:ss : 20-2-2018 03:38:05
		3. Date Format with dd MMMM yyyy : 20 February 2018
		4. Date Format with dd MMMM yyyy zzzz : 20 February 2018 India Standard Time
		5. Date Format with E, dd MMM yyyy HH:mm:ss z : Tue, 20 Feb 2018 15:38:05 IST
		*/

		
		/*Date date = new Date();  
		System.out.println(date);
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);*/  
	  
	    /*formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	    */
	    
	    
	    //convert string into date
	    /*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    try {  
	        Date date = formatter.parse("31/03/2015");  
	        System.out.println("Date is: "+date);  
	    } catch (ParseException e) {
	    	e.printStackTrace();
	    }  */
	    
	    
		//convert string into date
		/*String sDate1="31/12/1998";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  */
	    
	    
	    
		String sDate1="31/12/1998";  
	    String sDate2 = "31-Dec-1998";  
	    String sDate3 = "12 31, 1998";  
	    String sDate4 = "Thu, Dec 31 1998";  
	    String sDate5 = "Thu, Dec 31 1998 23:37:50";  
	    String sDate6 = "31-Dec-1998 23:37:50";  
	    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
	    SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
	    SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
	    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
	    SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
	    SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
	    Date date1=formatter1.parse(sDate1);  
	    Date date2=formatter2.parse(sDate2);  
	    Date date3=formatter3.parse(sDate3);  
	    Date date4=formatter4.parse(sDate4);  
	    Date date5=formatter5.parse(sDate5);  
	    Date date6=formatter6.parse(sDate6);  
	    System.out.println(sDate1+"\t"+date1);  
	    System.out.println(sDate2+"\t"+date2);  
	    System.out.println(sDate3+"\t"+date3);  
	    System.out.println(sDate4+"\t"+date4);  
	    System.out.println(sDate5+"\t"+date5);  
	    System.out.println(sDate6+"\t"+date6);  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
