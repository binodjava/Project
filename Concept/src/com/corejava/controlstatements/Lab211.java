package com.corejava.controlstatements;

public class Lab211 {
	public static void main(String[] args) {
		char ch = 'A';
		int rows = 0;
		while (rows < 5) {
			int cols = 0;
			while (cols <= rows) {
				System.out.print(ch + " ");
				cols++;
			}
			System.out.println();
			rows++;
		}

	}

}


/* 
A
A A 
A A A 
A A A A 
A A A A A 
*/