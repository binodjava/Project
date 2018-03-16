package com.companies;

import java.util.Scanner;

public class Inffrd1 {
	// Write the logic inside a static method and call it from main method (best
	// idea for coding)

	static String JustGreaterAndSmallNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter the number");
		String n=sc.nextLine();
		int nlength=n.length();
		char[] ch=n.toCharArray();
		int dlast,dprev;
		String value;
		dlast=Integer.parseInt(n)%10;
		dprev=Integer.parseInt(n)%100;
		if(dlast>dprev){
			ch[nlength-2]=(char) dlast;
			value=String.valueOf(ch);
			return value;
			
		}else{
			ch[nlength-2]=(char) dprev;
			value=String.valueOf(ch);
		}
		for (int i=0;i<=nlength;i++){
			dlast=sc.nextInt()%10;
			dprev=sc.nextInt()%100;
			if(dprev-dlast!=1){
				return "";
			}
			return "Not possible";
		}
		return value;

	}

	public static void main(String[] args) {

		JustGreaterAndSmallNumber();
	}

}
