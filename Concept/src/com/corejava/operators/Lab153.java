package com.corejava.operators;

class Student {
}

public class Lab153 {
	public static void main(String[] args) {
		Object obj = new Student();
		System.out.println(obj instanceof String);//false
		System.out.println(obj instanceof Student);//true
		System.out.println(obj instanceof Object);//true

	}

}
