package com.oops.classmembers.constructors;

public class Lab330 {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.sid = 99;
		stu.sname = "Binod";
		stu.show();

	}

}

class Student1 {
	int sid;
	String sname;

	Student1() {
		System.out.println("Student1 Default Constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
/*
Student1 Default Constructor
99	Binod
*/