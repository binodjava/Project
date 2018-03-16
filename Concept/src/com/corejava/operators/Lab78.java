package com.corejava.operators;

public class Lab78 {
	public static void main(String[] args) {
		final byte b1=90;
		final byte b2=38;
		byte b3=b1+b2;//90+38=128, byte can store max 127 so need to typecast or change data type
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
