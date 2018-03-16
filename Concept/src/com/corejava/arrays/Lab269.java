package com.corejava.arrays;

public class Lab269 {
	static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		show(new int[4] { 99, 88, 77, 66 });//Cannot define dimension expressions when an array initializer is provided
		

	}

}


//when arry is initializer, no need to define dimension