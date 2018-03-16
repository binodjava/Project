package com.corejava.controlstatements;

public class Lab185 {
	public static void main(String[] args) {
		char ch = 'B';
		if (ch >= 65 && ch <= 90) {
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Character is Vowel");
				break;

			default:
				System.out.println("Character is constant");
				break;
			}

		} else {
			System.out.println("Invalid Alphabet");
		}

	}

}

//Character is Vowel
//Switch can be empty also