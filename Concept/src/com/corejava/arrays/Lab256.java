package com.corejava.arrays;

public class Lab256 {
	public static void main(String[] args) {

		final int arr[] = new int[2];
		System.out.println("Len :" + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		arr[0] = 99;
		arr[1] = 98;
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}

}

/*Len :2
0
0
99
98
*/


//Array length can't be change but value can be changed