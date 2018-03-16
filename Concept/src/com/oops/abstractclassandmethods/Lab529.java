package com.oops.abstractclassandmethods;

public class Lab529 {
	public static void main(String[] args) {

		Shape sp = new Square();
		sp.area();
	}

}

class Shape {
	void area() {

		System.out.println("area");
	}
}

class Square extends Shape {

}