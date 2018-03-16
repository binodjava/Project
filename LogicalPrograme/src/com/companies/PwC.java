package com.companies;

import java.util.ArrayList;
import java.util.List;

public class PwC {

	static List<Integer> reverseList(ArrayList<Integer> myList) {
		List<Integer> reverseList = new ArrayList<Integer>();
		for (int i = myList.size() - 1; i >= 0; i--) {
			reverseList.add((Integer) myList.get(i));
		}

		return reverseList;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Original list : "+list);
		System.out.println("Reverse list : "+PwC.reverseList((ArrayList<Integer>) list));

	}

}
