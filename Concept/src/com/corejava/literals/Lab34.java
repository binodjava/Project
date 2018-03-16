package com.corejava.literals;

public class Lab34 {
	public static void main(String[] args) {
		char ch1 = 0;
		char ch2 = 255;
		char ch3 = 256;
		char ch4 = 257;
		System.out.println(ch1);//
		System.out.println(ch2);//ÿ
		System.out.println(ch3);//?
		System.out.println(ch4);//?
		
		//Since, ASCII Range is [0-255], greater than 255 it JVM will print ????
		
	}

}
