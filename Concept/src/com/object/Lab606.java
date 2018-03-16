package com.object;

public class Lab606 {
	public static void main(String[] args) {

		String st1 = new String("Binod");
		String st2 = new String("Binod");
		String st3 = new String("Thakur");
		System.out.println("Using == operator");// Using == operator
		System.out.println(st1 == st2);// false
		System.out.println(st1 == st3);// false
		System.out.println("Using equals()");// Using equals()
		System.out.println(st1.equals(st2));// true
		System.out.println(st1.equals(st3));// false

	}
	
}


/*	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
*/