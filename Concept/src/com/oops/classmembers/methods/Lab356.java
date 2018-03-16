package com.oops.classmembers.methods;

public class Lab356 {
	public static void main(String[] args) {
		Student s=new Student();
		s.show();//The method show() is undefined for the type Student
		
	}

}
class Student{
	show(){//Return type for the method is missing
		System.out.println("show()");
	}
}
//Method should always have return type