package com.oops.dynamicdispatch;

public class Lab522 {
	public static void main(String[] args) {
		Person p = null;
		p = new Student();
		Student stu=(Student)p;
		stu.reading();
		
		p=new Employee();
		Employee emp=(Employee)p;
		emp.working();
		
		/*Student->reading()
		Employee->working()
*/
	
		

	}

}

