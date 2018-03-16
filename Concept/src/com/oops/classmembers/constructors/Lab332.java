package com.oops.classmembers.constructors;

public class Lab332 {
	public static void main(String[] args) {
		Student3 stu = new Student3();//The constructor Student3() is undefined
//		JVM will not provide default constructor,
//		so only way we have to pass two parameters in constructor
		stu.sid = 99;
		stu.sname = "Binod";
		stu.show();

	}

}

class Student3 {
	int sid;
	String sname;

	Student3(int id, String sn) {
		System.out.println("Student3 2-Args Constructor");
		sid = id;
		sname = sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
