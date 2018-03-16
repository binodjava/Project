package com.corejava.arrays;

public class Lab253 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);
		arr.length = 30;//The final field array.length cannot be assigned
		System.out.println(arr.length);

	}

}
//Since, arr.length is final variable, so we can't modified it.