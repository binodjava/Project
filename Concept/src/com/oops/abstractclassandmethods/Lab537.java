package com.oops.abstractclassandmethods;

public class Lab537 {
	public static void main(String[] args) {
		System.out.println(Hello.A);
		//Hello h=new Hello();//Cannot instantiate the type Hello
		Hello.show();
		
		
	/*	1234
		Hello->show()*/	
//If you don't want to create object of a class make it abstract class.

		

	}
}

abstract class Hello {
	static int A = 1234;

	static void show() {
		System.out.println("Hello->show()");
	}

}