package com.corejava.controlstatements;

public class Lab177 {
	public static void main(String[] args) {
		Course c = Course.CORE;
		switch (c) {
		case ADV:
			System.out.println("100% Placement");
		case CORE:
			System.out.println("No Placement");

		}

	}

}

enum Course {
	ADV, CORE;
}
// No Placement