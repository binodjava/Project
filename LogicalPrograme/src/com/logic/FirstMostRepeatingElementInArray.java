package com.logic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class FirstMostRepeatingElementInArray {
	public static void main(String args[]) {
		int[] inputArray = { 4, 4, 10, 4, 10 };
		Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		HashSet<Integer> hSet = new HashSet<Integer>();
		for (int i : inputArray) {
			if (hSet.add(i)) {
				hMap.put(i, 1);
			} else {
				hMap.put(i, hMap.get(i) + 1);
			}
		}
		Iterator<Integer> iter = hMap.values().iterator();
		int temp = 0;
		while (iter.hasNext()) {
			int max = iter.next();
			if (max > temp) {
				temp = max;
			}
		}
		
		System.out.println(temp);
	}

}
