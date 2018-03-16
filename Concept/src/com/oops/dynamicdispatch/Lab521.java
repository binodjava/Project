package com.oops.dynamicdispatch;

public class Lab521 {
	public static void main(String[] args) {
		Person p = null;
		p = new Student();
		p.reading();// The method reading() is undefined for the type Person
		// When we're calling a method with super class ref which contains sub
		// class object then method signature should be availabe in super class
		p = new Employee();
		p.working();// The method working() is undefined for the type Person

	}

}
