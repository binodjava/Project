package com.corejava.controlstatements;

public class Lab174 {
	public static void main(String[] args) {
		int a = 3;
		switch (a) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong Input");

		}

	}

}



//OUTPUT: Wednesday
//Switch is also like if-else statement, if all d condition is false then it will print default statement same like else statement in if-else.
//we can pass [byte,short,char,int] and [enum & String] as an argument in switch














