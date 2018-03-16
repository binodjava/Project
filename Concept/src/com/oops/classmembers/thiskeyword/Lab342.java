package com.oops.classmembers.thiskeyword;

public class Lab342 {
	public static void main(String[] args) {

		Student stu1 = new Student(88, "Bk");
		stu1.show();
		Student stu2 = new Student(99, "Kumar");
		stu2.show();
	}

}

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) {
		System.out.println("Student 2-Args Constructor");
		sid = sid;
		sname = sname;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}




/*

Student 2-Args Constructor
0	null
Student 2-Args Constructor
0	null


*/





