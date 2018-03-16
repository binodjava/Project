package com.hackerRank;

import java.util.Scanner;

public class Day2 {
	public static void main(String[] args) {
		
		  Scanner in = new Scanner(System.in);
		  System.out.println("Plz enter the values...!");
	        double meal_cost = in.nextDouble();
	        int tip_percent = in.nextInt();
	        int tax_percent = in.nextInt();
	        
	        //logic starts
	        int totalCost=(int)(meal_cost+((meal_cost*tip_percent/100))+((meal_cost*tax_percent)/100));
	        System.out.println(Math.round(totalCost));
	                
	        in.close();
	}

}
