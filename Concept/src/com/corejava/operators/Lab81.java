package com.corejava.operators;

public class Lab81 {
	public static void main(String[] args) {
		System.out.println(20 / 0.0);//Infinity
		System.out.println(20 / -0.0);//-Infinity
		System.out.println(20.0 / 0);//Infinity
		System.out.println(-20.0 / 0);//-Infinity
		double d1 = 10 / 0.0;
		System.out.println(d1);//Infinity

	}

}
