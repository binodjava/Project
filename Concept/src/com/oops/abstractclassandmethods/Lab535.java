package com.oops.abstractclassandmethods;

public class Lab535 {
	public static void main(String[] args) {
		Person p = new CurrentStudent();
		p.sleeping();//Student->sleeping()
		p.walking();//CurrentStudent->walking()

	}

}

abstract class Person {
	abstract void sleeping();
	abstract void walking();
}

abstract class Student extends Person {
	void sleeping() {
		System.out.println("Student->sleeping()");
	}
}//Q.Why??????
//One abstract method is implementing and other in CurrentStudent class


class CurrentStudent extends Student {

	@Override
	void walking() {

		System.out.println("CurrentStudent->walking()");
	}

}
