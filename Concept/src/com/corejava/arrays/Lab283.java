package com.corejava.arrays;

public class Lab283 {
	public static void main(String[] args) {
		int arr[][] = null;
		arr = new int[3][];
		int temp[] = { 99, 88, 77, 66 };
		System.out.println("L :" + arr.length);
		arr[0] = new int[4];
		arr[1] = new int[] { 10, 20, 30 };
		arr[2] = temp;
		for (int ar[] : arr) {
			for (int a : ar) {
				System.out.print("\t" + a);
				System.out.println();
			}
		}

	}

}
