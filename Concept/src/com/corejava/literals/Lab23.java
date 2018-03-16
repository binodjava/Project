package com.corejava.literals;

public class Lab23 {
	public static void main(String[] args) {
//		char ch1='';  //Empty [char can't be empty]
		//1. Char literal can't be empty, it should contains some character.
		//2. Char means one char anything
		//3. Char means single char
		//4. Char literal can't be more than one 
		
//		System.out.println(ch1);
		char ch2=' '; //Two Space
		System.out.println(ch2);
		System.out.println((int)ch2);
//		char ch3='AB'; //Invalid character constant
		
		char ch4='\'; 
				
				/*Back slace \ always comes with some special characters
				Like
				\t	Tab space
				\b	Backspace
				\n	Newlin
				\r	Carriage return
				\f	Formfeed
				\'	Single quote character
				\"	Double quote character"
				\\	Backslash character
				*/
				
				
				
				
		System.out.println(ch4);
		System.out.println((int)ch4);
		char ch5=''';
		System.out.println(ch5);
		System.out.println((int)ch5);

	}

}
