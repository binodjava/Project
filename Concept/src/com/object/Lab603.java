package com.object;

public class Lab603 {
	public static void main(String[] args) {
		
		Student2 st1 = null;
		System.out.println(st1);//null
		
		st1 = new Student2(99, "BK");//toString() method is not overriden that's why,
		System.out.println(st1);//com.object.Student2@6d06d69c
		
		String str = new String("Binod Kumar Thakur");//toString() is overriden in String class to print content 
		System.out.println(str);//Binod Kumar Thakur
		
		Integer ref = new Integer(123);//toString() is overriden in all wrapper class to print content 
		System.out.println(ref);//123

	}

}

class Student2 {
	int sid;
	String sname;

	Student2(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}
}
