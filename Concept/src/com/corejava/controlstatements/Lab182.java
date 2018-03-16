package com.corejava.controlstatements;

public class Lab182 {
	public static void main(String[] args) {
		int a = 45;
		final int x = 20;//CONSTANT
		switch (a) {
		case 10:
			System.out.println("TEN");
			break;
		case x:
			System.out.println("TWENTY");//case value should be constant only
			break;
		case 'A':
			System.out.println("CHAR-A");
			break;
		case 10 + 20 + 15:
			System.out.println("CONSTANT EXP");
			break;
		default:
			System.out.println("DEFAULT");
			break;
		}

	}

}
