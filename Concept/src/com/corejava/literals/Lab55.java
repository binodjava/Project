package com.corejava.literals;

public class Lab55 {
	public static void main(String[] args) {
		double d1 = 1234.567;
		double d2 = 123.4567;
		System.out.println(d1);//1234.567
		System.out.println(d2);//123.4567
		
		//float f1=12987.63;//internally it takes double value, have to mention explictly float
		float f2=12987.63f;//
		float f3=12987.63F;//
		
		float f4=129.863e+2F;
		double d3=129.8763e+2;
		double d4=12987.63e-2;
		System.out.println(f4);//12986.3
		System.out.println(d3);//12987.63
		System.out.println(d4);//129.8763
		
		
		

	}
}
