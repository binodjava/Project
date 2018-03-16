package com.oops.classmembers.constructors;

public class Lab333 {
	public static void main(String[] args) {
		Student4 stu = new Student4(88, "Binod");
		stu.show();
		Student4 stu1 = new Student4(88, "Binod");
		stu1.show();
	}
}

class Student4 {
	int sid;
	String sname;

/*	Student4(int id, String sn) {
		System.out.println("Student3 2-Args Constructor");
		sid = id;
		sname = sn;
	}
	*/
	Student4(int sid, String sname) {
		System.out.println("Student3 2-Args Constructor");
		this.sid=sid;
		this.sname=sname;
	}
	
	

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}

//We are passing values through constructor and assigning it to class level variables.
//Actually. we are taking value from constructor and assigning to main variable 
//Here 'this' keyword comes into the picture
//this.sid=sid;
//this.sname=sname;
//i.e on current object ref,we're assigning the values that comes from constructor.






/*
OUTPUT
Student3 2-Args Constructor
88	Binod
Student3 2-Args Constructor
88	Binod*/

















