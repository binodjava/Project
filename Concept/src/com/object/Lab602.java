package com.object;

public class Lab602 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(99, 31903290);
		Employee emp2 = new Employee(99, 31903290);
		Employee emp3 = new Employee(88, 65799999);
		Employee emp4 = emp1;

		System.out.println(emp1.hashCode());//99
		System.out.println(emp2.hashCode());//99
		System.out.println(emp3.hashCode());//88
		System.out.println(emp4.hashCode());//99

		System.out.println(emp1 == emp2);//false
		System.out.println(emp1 == emp3);//false
		System.out.println(emp1 == emp4);//true
		System.out.println(emp3 == emp4);//false

	}

}

class Employee {
	int eid;
	long phone;

	Employee(int eid, long phone) {
		this.eid = eid;
		this.phone = phone;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return (int) (phone | eid);
		return eid;
	}
}
