package com.oops.classmembers.constructors;

public class Lab338 {
	public static void main(String[] args) {
		Student7 stu = new Student7(77, "BKT");//The constructor Student7(int, String) is undefined
		stu.show();

	}

}

class Student7 {
	int sid;
	String sname;

	void Student7(int id, String sn) {//This method has a constructor name
		sid = id;
		sname = sn;

	}
//	We can't use void with constructor

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
