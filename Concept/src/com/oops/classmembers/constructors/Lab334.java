package com.oops.classmembers.constructors;

public class Lab334 {
	public static void main(String[] args) {

		Student5 stu = new Student5();
		stu.show();

		Student5 stu1 = new Student5(99, "Binod");
		stu1.show();
	}

}

class Student5 {
	int sid;
	String sname;

	Student5() {
		System.out.println("Student Default Constructor");
	}

	Student5(int id, String sn) {
		System.out.println("Student4 2-Args Constructor");
		sid = id;
		sname = sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}

}





/*
Student Default Constructor
0	null
Student4 2-Args Constructor
99	Binod*/












