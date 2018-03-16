package com.corejava.literals;

public class Lab24 {
	public static void main(String[] args) {
		char ch1 = ' '; // One Space
		char ch2 = '	'; // Tab Key
		char ch3 = '/'; // Forward slace
		System.out.println("One Space : " + (int) ch1);
		System.out.println("Tab Key : " + (int) ch2);
		System.out.println("Forward slace : " + (int) ch3);
		
	/*	
		One Space : 32
		Tab Key   : 9
		Forward slace : 47

		char takes always ASCII value not int value*/
		

	}

}
