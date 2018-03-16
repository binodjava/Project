package com.corejava.arrays;

public class Lab281 {
	public static void main(String[] args) {
		int arr[][] = null;
		arr = new int[3][2];
		System.out.println("Len :" + arr.length);
		arr[0] = 1234;//Type mismatch: cannot convert from int to int[]
		System.out.println(arr[0]);
	}

}
