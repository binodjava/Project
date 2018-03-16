package com.oops.classmembers.methods;

public class Lab359 {
	public static void main(String[] args) {
		Student3 s = new Student3();
		s.setAge(-12);

	}

}

class Student3 {
	int age = 18;

	void setAge(int age) {
		if (age < 18)
			return 0;//Void methods cannot return a value
		this.age = age;
	}
}
//Problem 1: Method is void but still we're returning 0.
//Problem 2: "this.age = age;" is unreachable statement