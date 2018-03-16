package com.corejava.arrays;

public class Lab240 {
	public static void main(String[] args) {
		
//		Declaration
		String arr[];
		
//		Construction
		arr = new String[3];
		
		
		
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("----------------------");

		
/*		null
		null
		null
		----------------------*/
		
//		Initialization
		arr[0] = "Binod";
		arr[1] = "Kumar";
		arr[2] = "Thakur";
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		/*Binod
		Kumar
		Thakur*/
		
		

	}

}
