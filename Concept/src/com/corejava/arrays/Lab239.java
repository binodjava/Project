package com.corejava.arrays;

public class Lab239 {
	public static void main(String[] args) {
		int arr[];
		arr = new int[3];
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("-----------------");
		
/*		0
		0
		0
		-----------------*/
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
	/*	10
		20
		30
*/
		
	}

}
