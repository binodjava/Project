package com.oops.inheritance.withsuperkeyword;

public class Lab440 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.show();
		
	/*	30
		20
		10*/


	}

}

class Hai {
	int a = 10;
}

class Hello extends Hai {
	int a = 20;

	void show() {
		int a = 30;
		System.out.println(a);//accessing local var
		System.out.println(this.a);//using class level var
		System.out.println(super.a);//using parent level var
	}
}
