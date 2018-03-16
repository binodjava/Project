package com.binod;

import java.util.HashSet;

public class TestEmp1 {
	public static void main(String[] args) {
		/*Emp1 emp1 = new Emp1(23);
		Emp1 emp2 = new Emp1(23);
		System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));
		System.out.println(emp1);
		System.out.println(emp2);*/
		
		
		Emp1 emp1 = new Emp1(23);
		Emp1 emp2 = new Emp1(24);
		Emp1 emp3 = new Emp1(25);
		Emp1 emp4 = new Emp1(26);
		Emp1 emp5 = new Emp1(27);
		HashSet<Emp1> hs = new HashSet<Emp1>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		
		System.out.println("HashSet Size--->>>"+hs.size());
		System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp1(25)));
		System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove( new Emp1(24)));
		System.out.println("Now HashSet Size--->>>"+hs.size());
	}
}