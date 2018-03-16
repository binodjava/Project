package com.corejava.arrays;

public class Lab249 {
	public static void main(String[] args) {
		int arr[] = new int[1];
		System.out.println("Len :" + arr.length);//Len :1
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//java.lang.ArrayIndexOutOfBoundsException: 1

	}

}
//When there is no element in array but we tried accessing it will get
//java.lang.ArrayIndexOutOfBoundsException: 1