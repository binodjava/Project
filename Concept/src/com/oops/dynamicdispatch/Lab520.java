package com.oops.dynamicdispatch;

public class Lab520 {
	public static void main(String[] args) {
		Person p = null;
		p = new Student();
		p.sleeping();// Person->Sleeping()
		p = new Employee();
		p.sleeping();// Person->Sleeping()
		// If methos is static, then call will happen based on which class ref
		// hollding the object
		// here method is satic and Person class holding the object, so person
		// class method will be called

	}

}
