package com.corejava.arrays;

public class Lab244 {
	public static void main(String[] args) {
		byte b = 5;
		int arr1[] = new int[b];
		short s = 4;
		int arr2[] = new int[s];
		System.out.println(arr1.length);//5
		System.out.println(arr2.length);//4
		System.out.println("------------------");
		
		char ch = 'A';
		int arr3[] = new int[ch];
		System.out.println(arr3.length);//65
		System.out.println("-------------");
		
		int arr4[] = new int[5];
		System.out.println(arr4.length);//5
		System.out.println("-----------");
		int arr5[] = new int[10 + 20 / 5];
		System.out.println(arr5.length);//14
		System.out.println("---------------");
		double d = 12.34;
		int arr6[] = new int[(int) d];
		System.out.println(arr6.length);//12
		
		
		
//		Parameter will be always int type only
		
		
		
		
		
		

	}

}
