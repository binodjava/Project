package com.oops.classmembers.constructors;

public class Lab331 {
	public static void main(String[] args) {

		Student2 stu = new Student2();
		stu.sid = 99;
		stu.sname = "Binod";
		stu.show();
	}

}

class Student2 {
	int sid;
	String sname;

	Student2() {
		System.out.println("Student2 Default Constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
/*
Student2 Default Constructor
99	Binod
*/