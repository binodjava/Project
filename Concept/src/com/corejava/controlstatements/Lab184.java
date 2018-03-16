package com.corejava.controlstatements;

public class Lab184 {
	public static void main(String[] args) {
		int a = 23;
		switch (a) {
		default:
			System.out.println("DEFAULT");
			break;
		case 10:
			System.out.println("TEN");
			break;
		case 10 + 10:
			System.out.println("TWENTY");
			break;

		}
	}
}

//DEFAULT
//We can use Default any where in switch..
//in if-else else can be used after if, but in switch default can be used anywhere