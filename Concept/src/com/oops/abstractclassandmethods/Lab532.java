package com.oops.abstractclassandmethods;

public class Lab532 {
	public static void main(String[] args) {
		Shape3 s=new Shape3();//Cannot instantiate the type Shape3
//We can't create object of abstract class		
		s.area();
	}

}

abstract class Shape3 {
	abstract void area();
}

