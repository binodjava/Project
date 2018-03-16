package com.oops.classmembers.constructors;

public class Lab335 {
	public static void main(String[] args) {
		Student6 stu1 = new Student6(99, "Binod", "bkt@gmail", 9066800603l);
		stu1.show();
		Student6 stu2 = new Student6(88, "Kumar", "kr@gmail");
		stu2.show();
		Student6 stu3 = new Student6(77, "Thakur");
		stu3.show();
		Student6 stu4 = new Student6();
		stu4.show();

	}

}

class Student6 {
	int sid;
	String sname;
	String email;
	long phone;

	Student6(int id, String sn, String em, long ph) {
		System.out.println("Student6 4-Args Constructor");
		sid = id;
		sname = sn;
		email = em;
		phone = ph;
	}

	Student6(int id, String sn, String em) {
		System.out.println("Student6 3-Args Constructor");
		sid = id;
		sname = sn;
		email = em;
	}

	Student6(int id, String sn) {
		System.out.println("Student6 2-Args Constructor");
		sid = id;
		sname = sn;
	}

	Student6() {
		System.out.println("Student6 Default Constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname + "\t" + email + "\t" + phone);
	}

}



/*Student6 4-Args Constructor
99	Binod	bkt@gmail	9066800603
Student6 3-Args Constructor
88	Kumar	kr@gmail	0
Student6 2-Args Constructor
77	Thakur	null	0
Student6 Default Constructor
0	null	null	0

*/
















