package com.corejava.controlstatements;

public class Lab180 {
	public static void main(String[] args) {
		int a = 98;
		int x = 96;
		switch (a) {
		case 98:
			System.out.println("Val-98");
			break;
		case x://case expressions must be constant expressions
			System.out.println("Val-x");
			break;

		}

	}

}
