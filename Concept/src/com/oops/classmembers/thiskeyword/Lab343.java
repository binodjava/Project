package com.oops.classmembers.thiskeyword;

public class Lab343 {
	public static void main(String[] args) {

		Student1 s1 = new Student1(88, "BK");
		s1.show();
		Student1 s2 = new Student1(99, "Thakur");
		s2.show();
	}

}

class Student1 {
	int sid;
	String sname;

	Student1(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}



/*88	BK
99	Thakur
*/