package com.oops.classmembers.methods;

public class Lab358 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setAge(-12);
		System.out.println(s.age);//18??????????

	}

}

class Student2 {
	int age = 18;

	void setAge(int age) {
		if (age < 18)
			return;
		this.age = age;
	}
}

/*We're returning the control before "this.age=age"
so value -12 from method parameter has not assigned to age var.
i.e "this.age=age" is unreachable statement.*/








