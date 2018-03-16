package com.object;

public class Lab607 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(99, "Sri");
		Student1 s2 = new Student1(99, "Sri");
		Student1 s3 = new Student1(88, "Nivas");
		Student1 s4 = s1;

		System.out.println("Using == operaotr");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);

		System.out.println("Using equals()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));

	}

}

class Student1 {
	int sid;
	String name;

	Student1(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	
	//Without Overriding Equals Methods.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1) {
			Student1 st = (Student1) obj;
			return this.sid == st.sid && this.name.equals(st.name);
		}
		return false;
	}
	

}


/*
1.When you compare referece type variables using == operator then it will compare the addresses availabe in ref variable
2.When you want to compare the contents of two object then you can use equals() method.
3.Two types of equals method
a)Object class equals(), default
b)Overridded equals() method

default: public boolean equals(Object obj){
	return this==obj;

}


Note:- You can override equals() method in your class when you want to compare contents of two objects
Usually equals() method is overridden in many java buit-in class to compare contents of objects






*/





















