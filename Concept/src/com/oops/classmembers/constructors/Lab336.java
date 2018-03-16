package com.oops.classmembers.constructors;

public class Lab336 {
	public static void main(String[] args) {
		Student8 stu = new Student8();
		stu.Student8(77, "BK");//The method Student8(int, String) is undefined for the type Student8
		stu.show();

	}

}

class Student8 {
	int sid;
	String sname;

	Student8(int id, String sn) {
		System.out.println("Student 2-Args Constructor");
		sid = id;
		sname = sn;
	}
	
	
/*	void Student8(int id, String sn) {
		System.out.println("Student 2-Args Constructor");
		sid = id;
		sname = sn;
	}*/
	

	Student8() {
		System.out.println("Student8 Default Constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}