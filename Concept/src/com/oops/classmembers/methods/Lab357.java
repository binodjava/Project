package com.oops.classmembers.methods;

public class Lab357 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setAge(-12);
		System.out.println(s.age);//-12
		

	}

}

class Student1 {
	int age;

	void setAge(int age) {
		this.age = age;
	}
}