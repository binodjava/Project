package com.oops.abstractclassandmethods;

public class Lab533 {
	public static void main(String[] args) {
		Shape4 sp = new Square4();
		sp.area();

	}

}

abstract class Shape4 {
	abstract void area();
}

class Square4 extends Shape4 {

}


/*
-===========================================
must be implement abstract method or write abstract method either
type Square4 must implement the inherited abstract method Shape4.area()*/