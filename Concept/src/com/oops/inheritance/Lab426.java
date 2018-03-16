package com.oops.inheritance;

public class Lab426 {
	public static void main(String[] args) {
		System.out.println("Hello");
	}

}

class A4 extends A4 {//Cycle detected: the type A4 cannot extend/implement itself or one of its own member types
}

//Cyclic inheritance is not allowed in java, one class can't extends itself