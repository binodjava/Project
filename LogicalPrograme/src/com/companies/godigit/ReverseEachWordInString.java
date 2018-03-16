package com.companies.godigit;

public class ReverseEachWordInString {

	public static String reverseWord(String str){
		String[] words=str.split("\\s");
		String reverseWord="";
		for(String w:words){
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord+=sb.toString()+" "; //this space is used for give space between words
		}
		
	
		return reverseWord.trim();
		/*The java string trim() method eliminates leading and trailing spaces. The unicode value of space character 
		is '\u0020'. The trim() method in java string checks this unicode value before and after the string, if it 
		exists then removes the spaces and returns the omitted string.
		
		*String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()     :  hello string   javatpoint
		System.out.println(s1.trim()+"javatpoint");//with trim() :hello stringjavatpoint 
		
		*
		*/
	}
		
	public static void main(String[] args) {
		System.out.println(ReverseEachWordInString.reverseWord("my name is binod"));
		System.out.println(ReverseEachWordInString.reverseWord("I live in bangalore"));
		
		
	}

}
