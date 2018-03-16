package com.companies.godigit;

public class StringNoOfOccurances {

	static int NoOfOccurances(String s1, String s2) {
		int count = 0;
		int lastIndex = 0;
		

		while (lastIndex != -1) {
			lastIndex = s1.indexOf(s2, lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += s2.length();
			}
		}
		System.out.println(s2+" is occuring "+ count+" times");
		return count;
	}
	
	/*Java String indexOf
	The java string indexOf() method returns index of given character value or substring. If it is not found, it returns -1. 
	The index counter starts from zero.

	Signature:-
	There are 4 types of indexOf method in java. The signature of indexOf methods are given below:

	No.	Method	Description
	1	int indexOf(int ch)								returns index position for the given char value
	2	int indexOf(int ch, int fromIndex)				returns index position for the given char value and from index
	3	int indexOf(String substring)					returns index position for the given substring
	4	int indexOf(String substring, int fromIndex)	returns index position for the given substring and from index*/

	public static void main(String[] args) {
		StringNoOfOccurances.NoOfOccurances("abababababab","ab");
		StringNoOfOccurances.NoOfOccurances("bbbbbbbbbabababaaaaaaaaa","ab");

	}

}
