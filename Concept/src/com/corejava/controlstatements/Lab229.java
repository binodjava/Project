package com.corejava.controlstatements;

public class Lab229 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\n" + i);
			for (int j = 1; j <= 5; j++, System.out.println("J++")) {
				if (i == 3)
					continue;
				System.out.println("JLC" + j);
			}
		}
	}

}



/*1
JLC1
J++
JLC2
J++
JLC3
J++
JLC4
J++
JLC5
J++

2
JLC1
J++
JLC2
J++
JLC3
J++
JLC4
J++
JLC5
J++

3
J++
J++
J++
J++
J++

4
JLC1
J++
JLC2
J++
JLC3
J++
JLC4
J++
JLC5
J++

5
JLC1
J++
JLC2
J++
JLC3
J++
JLC4
J++
JLC5
J++*/