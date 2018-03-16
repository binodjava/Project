package com.companies;

import java.util.Arrays;

public class Inffrd {
	
	static void isAnagram(String str1, String str2) {
		//Logic 1:Removing the while spaces from string
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str1.replaceAll("\\s", "");
		//Logic 2:Checking whether length is same or not
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			//Logic 3:If yes then logic implementation
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status = Arrays.equals(arrayS1, arrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are  not anagrams");
		}
	}
	
	public static void main(String[] args) {
		//Logic 4:Calling static method directly from main methond
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");
		
		
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the 1st string...!");
		String str1=sc.nextLine();
		System.out.println("Please enter the 2nd string...!");
		boolean flag=false;
		String str2=sc.nextLine();
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		flag=Arrays.equals(ch1, ch2);
		if(flag){
			System.out.println(str1+" and "+str2+" are anagrames");
		}else{
			System.out.println(str1+" and "+str2+" are not anagrames");
		}
		*/
		
	

	}

}
