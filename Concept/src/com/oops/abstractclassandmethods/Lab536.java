package com.oops.abstractclassandmethods;

public class Lab536 {
	public static void main(String[] args) {
		Person1 p = new CurrentStudent1();
		p.sleeping();//Student->Sleeping


	}

}

abstract class Person1 {
	abstract void sleeping();
}

abstract class Student1 extends Person1 {
	void sleeping() {
		System.out.println("Student->Sleeping");
	}
}

class CurrentStudent1 extends Student1 {

}
// 1.If at least one method is abstract, class must be abstract
// 2.But abstract class may contain abstract method or may not be.
// It can have zero abstract method as well