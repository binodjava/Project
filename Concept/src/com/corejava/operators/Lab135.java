package com.corejava.operators;

class Hello{}
public class Lab135 {
	public static void main(String[] args) {
		String str=null;
		Hello h=null;
		Object ob=h;
		System.out.println(ob==str);//ncompatible operand types Hello and String
		
	}

}
