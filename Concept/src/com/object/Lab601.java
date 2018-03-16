package com.object;

public class Lab601 {
	public static void main(String[] args) {
		System.out.println("With Student");
		Student s1 = new Student(99, 31903290);
		Student s2 = new Student(99, 31903290);
		Student s3 = new Student(88, 65799999);
		Student s4 = s1;

		System.out.println(s1.hashCode());//1829164700
		System.out.println(s2.hashCode());//2018699554
		System.out.println(s3.hashCode());//1311053135
		System.out.println(s4.hashCode());//1829164700

		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//true
		System.out.println(s3 == s4);//false

	}

}

class Student {
	int sid;
	long phone;

	Student(int sid, long phone) {
		this.sid = sid;
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
