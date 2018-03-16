package com.corejava.variables;



class Hello1{
	char ch;
	void show(){
		System.out.println(ch==0);	//true
		//System.out.println(ch==''); 	//Invalid character constant (it must be compatible type)
		System.out.println(ch=='\u0000');	//true
	}
}
public class Lab2 {
	public static void main(String[] args) {
		Hello1 h=new Hello1();
		h.show();
		
	}

}
