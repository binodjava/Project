package com.oops.dynamicdispatch;

public class Lab518 {
	public static void main(String[] args) {
		Person p = null;
		p = new Student();
		p.eating();
		p = new Employee();
		p.eating();

	}

}


/*Person->eating()
Person->eating()*/
//we know that we call call super class method with sub class object.
//calling any method, it will search first in sub class if its not found then it will search in super class
