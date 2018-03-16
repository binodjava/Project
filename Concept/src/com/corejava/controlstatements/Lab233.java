package com.corejava.controlstatements;

public class Lab233 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			if (i == 3)
				continue;
			i++;
			System.out.println("After");
		}

	}

}
