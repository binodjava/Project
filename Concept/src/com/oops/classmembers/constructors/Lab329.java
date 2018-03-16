package com.oops.classmembers.constructors;

public class Lab329 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.show();
		Student stu12 = new Student();
		stu12.show();
	}

}
//Constructors are mainly used to initialized instance variables with diff set of valuues
class Student {
	int sid;
	String sname;

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}

/*0	null
0	null*/
