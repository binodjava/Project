package com.corejava.controlstatements;

public class Lab196 {
	public static void main(String[] args) {
		int i = 1;
		for (System.out.println("Start"), System.out.println("Begin"); i <= 5; i++, System.out
				.println("Updating"), System.out.println("Updating")) {
			System.out.println(i);
		}

	}

}


/*Start
Begin
1
Updating
Updating
2
Updating
Updating
3
Updating
Updating
4
Updating
Updating
5
Updating
Updating
*/