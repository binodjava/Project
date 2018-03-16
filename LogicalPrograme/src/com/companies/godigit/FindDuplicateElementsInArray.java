package com.companies.godigit;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateElementsInArray {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int[] a = { 1, 2, 3, 1, 3, 6, 6 };
		Arrays.sort(a);
		System.out.println("Array : " +Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					list.add(a[i]);
				}
			}
		}
		System.out.println(list);
		//System.out.println("Duplicate element is: " +Arrays.toString(duplicate));
		
		

	}
}