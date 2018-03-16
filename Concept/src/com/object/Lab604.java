package com.object;

public class Lab604 {
	public static void main(String[] args) {
		Student3 st1 = new Student3(99, "bk");
		System.out.println(st1);

		System.out.println("\nDefault implementation");
		String cname = st1.getClass().getName();
		int hc = st1.hashCode();
		String hx = Integer.toHexString(hc);
		String msg = cname + "@" + hx;
		System.out.println(msg);

	}

}

/*com.object.Student3@6d06d69c

Default implementation
com.object.Student3@6d06d69c*/




class Student3 {
	int sid;
	String sname;

	Student3(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
}
