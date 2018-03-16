package com.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DisplayDuplicateElementsFromAnArray {
	public static void main(String[] args) {
		showDuplicateElemetns(new int[] { 1, 2, 3, 1, 3, 6, 6 });

	}

	public static void showDuplicateElemetns(int a[]) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Given Array is : " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorting Array is : " + Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					list.add(a[i]);
				}
			}
		}
		
		System.out.println("Duplicate elements are :"+list);
	}
}
		
		//Logic 2:
		/*Set<Integer> set=new HashSet<>();
		for (int i=0;i<a.length;i++){
			if(set.add(a[i])==false){
				list.add(a[i]);
			}
		}
		
		System.out.println("Duplicate elements are :"+list);
	}*/


