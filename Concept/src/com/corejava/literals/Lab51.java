package com.corejava.literals;

public class Lab51 {

	public static void main(String[] args) {
		int a = 0xA;//Hexadecimal  [A*16^0=A*1=10*1=10]
		int b = 0x61;//Hexadecimal [6*16^1+1*16^0=96+1]
		int c = 0xface;//Hexadecimal [f*16^3+a*16^2+c*16^1+e*16^0=61440+2560+192+14]
		System.out.println(a);//10
		System.out.println(b);//97
		System.out.println(c);//64206

	}
}
