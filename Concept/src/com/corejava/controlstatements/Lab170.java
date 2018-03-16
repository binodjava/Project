package com.corejava.controlstatements;

public class Lab170 {
	public static void main(String[] args) {
		int a = 1;
		if (++a == 1)//a=2
			System.out.println("ONE");
		else if (++a == 2)//a=3
			System.out.println("TWO");
		else
			System.out.println("Not Matching");
		System.out.println(a);//a=3

	}

}
/*Not Matching
3

Control will check from up to down all condition, if any one is true it will come back out from
here pre increment is happening two times 
*
*/