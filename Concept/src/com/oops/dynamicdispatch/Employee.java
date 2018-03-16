package com.oops.dynamicdispatch;

public class Employee extends Person {
	void walking(){
		System.out.println("Employee->Walking()");
	}
	static void sleeping(){
		System.out.println("Employee->Sleeping");
	}
	void working(){
		System.out.println("Employee->working()");
	}

}
