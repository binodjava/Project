package com.logic;

public class MergingOf2Strings {
	public static void main(String[] args) {
		String result = join("abc", "xyzpqrs");
		System.out.println(result);

	}

	static String join(String s1, String s2) {
		String s3 = "";
		
		
		//Case 1: When both strings are equals
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				s3 += s1.charAt(i);
				s3 += s2.charAt(i);
			}

			
		//Case 2: When String1>String2
		} else if (s1.length() > s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				s3 += s1.charAt(i);
				s3 += s2.charAt(i);
			}
			s3 += s1.substring(s1.length() - s2.length());
			
			
		//Case 3: When String1<String2
		} else if (s2.length() > s1.length()) {
			for (int i = 0; i < s1.length(); i++) {
				s3 += s1.charAt(i);
				s3 += s2.charAt(i);
			}
			s3 += s2.substring(s2.length() - s1.length());
		}

		return s3;

	}
}
