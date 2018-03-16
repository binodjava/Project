package com.binod;

public class Emp1 {
	private int age;

	public Emp1(int age) {
		super();
		this.age = age;
	}

	public int hashCode() {
		return age;
	}

	public boolean equals(Object obj) {
		boolean flag = false;
		Emp1 emp = (Emp1) obj;
		if (emp.age == age)
			flag = true;
		return flag;
	}
}
