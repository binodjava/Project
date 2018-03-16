package com.corejava.controlstatements;

public class Lab220 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\n" + i);
			for (int j = 1; j <= 5; j++, System.out.println("J++")) {
				if (i == 3)
					break;
				System.out.println("BK" + j);
			}
		}
	}

}


/*1
BK1
J++
BK2
J++
BK3
J++
BK4
J++
BK5
J++

2
BK1
J++
BK2
J++
BK3
J++
BK4
J++
BK5
J++

3

4
BK1
J++
BK2
J++
BK3
J++
BK4
J++
BK5
J++

5
BK1
J++
BK2
J++
BK3
J++
BK4
J++
BK5
J++*/