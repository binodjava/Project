package com.object;

public class Lab605 {
	public static void main(String[] args) {
		Student4 st1 = new Student4(99, "BK");
		Student4 st2 = new Student4(88, "Kumar");
		System.out.println(st1);
		System.out.println(st2);

	}

}

class Student4 {
	int sid;
	String sname;

	Student4(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {

		return sid + "\t" + sname;
	}
}
/*

99	BK
88	Kumar*/
