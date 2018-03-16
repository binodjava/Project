package com.oops.abstractclassandmethods;

public class Lab530 {
	public static void main(String[] args) {
		Shape1 sp = new Square1();
		sp.area();

	}

}

class Shape1 {
	void area();//This method requires a body instead of a semicolon
//Concrete methods have a body, we should and must define the body for concrete method
//where as abstract method need not to have body.
}

class Square1 extends Shape1 {

}