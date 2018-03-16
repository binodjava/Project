package com.corejava.operators;

public class Lab106 {
	public static void main(String[] args) {
		
		int a=-1;
		//char ch=a;//Need typecast
		char ch=(char)a;
		System.out.println(a);//-1
		System.out.println(ch);//?
		int b=ch;
		System.out.println(b);//65535
	}

}
