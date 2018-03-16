package com.corejava.arrays;

public class Lab258 {
	public static void main(String[] args) {
		byte brr[]=new byte[3];
//		int arr[]=brr;
		System.out.println("Hello!!!!!!!!");
		System.out.println(brr.length);
		
		int arr[]=brr;//Type mismatch: cannot convert from byte[] to int[]
		
	}

}
