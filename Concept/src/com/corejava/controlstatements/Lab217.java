package com.corejava.controlstatements;

public class Lab217 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5)
				break;
			System.out.println("Inside Loop");
		}
		System.out.println("Outside Loop");
	}

}

/*1
Inside Loop
2
Inside Loop
3
Inside Loop
4
Inside Loop
5
Outside Loop*/
