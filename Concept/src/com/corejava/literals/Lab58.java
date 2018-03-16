package com.corejava.literals;

public class Lab58 {
	public static void main(String[] args) {
		int a = 2_45_12_452;
		System.out.println(a);//24512452 [it doesn't effect the output, used to separate digits]

		int _12=9898;
		System.out.println(_12);//1st digit in keyword can be alphabet/_/$, not digit
		
		int a1=_12;//above var value is assiginig to a1 var
		System.out.println(a1);
		
		
		int a2=_234;//can't be used at 1st digit 
		int a3=234_;//can't be used at last digit
		//it can be used only in between the numbers
		System.out.println(a2);
		
		
		
		
	}

}
