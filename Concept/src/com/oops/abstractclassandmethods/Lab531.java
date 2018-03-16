package com.oops.abstractclassandmethods;

public class Lab531 {
	public static void main(String[] args) {
		Shape2 sp= new Square2();
		sp.area();
	}

}
class Shape2{
	abstract void area();//The abstract method area in type Shape2 can only be defined by an abstract class
//Note:- if any one method is abstract, then calss must by abstract
}
class Square2 extends Shape2{}
