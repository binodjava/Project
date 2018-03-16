package com.oops.assessmodifiers.p3;

import com.oops.assessmodifiers.p1.Hello;

public class Lab487 {
	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.show();

	}

}

class Xyz extends Hello {
}

class Hai extends Hello {

	void show() {
		System.out.println("Hai->show()");
		Hello h = new Hello();
		System.out.println(h.ab);//The field Hello.ab is not visible
		Xyz ref = new Xyz();
		System.out.println(ref.ab);//The field Hello.ab is not visible

	}
}
