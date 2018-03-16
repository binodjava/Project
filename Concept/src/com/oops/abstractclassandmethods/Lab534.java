package com.oops.abstractclassandmethods;

public class Lab534 {
	public static void main(String[] args) {
		Shape5 sp = new Square5();
		sp.area();//Square->area

	}

}

abstract class Shape5 {
	abstract void area();
}

class Square5 extends Shape5 {

	@Override
	void area() {
		System.out.println("Square->area");
	}

}