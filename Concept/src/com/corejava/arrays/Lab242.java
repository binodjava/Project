package com.corejava.arrays;

public class Lab242 {
	public static void main(String[] args) {

		String arr[] = new String[3];
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("-----------");
		arr[0] = "Java";
		arr[1] = "Learning";
		arr[0] = "Center";
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}

/*null
null
null
-----------
Center
Learning
null
*/