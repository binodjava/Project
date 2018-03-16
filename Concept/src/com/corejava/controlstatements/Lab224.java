package com.corejava.controlstatements;

public class Lab224 {

	public static void main(String[] args) {
		int ab = 10;
		jlc: {
			System.out.println("JLC Block Starts");
			sd: {
				System.out.println("SD Block Starts");
				if (ab == 10)
					break jlc;//change it to sd
				System.out.println("SD Block Ends");
			}
			System.out.println("JLC Block Ends");
		}
		System.out.println("Completed");
	}
}
