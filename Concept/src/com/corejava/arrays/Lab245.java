package com.corejava.arrays;

public class Lab245 {
	public static void main(String[] args) {

		int arr[] = new int[2147483647];//Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
		System.out.println(arr.length);
	}

}
