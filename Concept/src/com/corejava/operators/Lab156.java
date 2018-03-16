package com.corejava.operators;

public class Lab156 {
	public static void main(String[] args) {
		int a=20>10?10:20.0;//Type mismatch: cannot convert from double to int
		double d=20>10?10:20.0;
		int x=10>20?10:"TWENTY";//Type mismatch: cannot convert from String to int
		String str=10>20?10:"TWENTY";//Type mismatch: cannot convert from int to String
		
		
	}

}
