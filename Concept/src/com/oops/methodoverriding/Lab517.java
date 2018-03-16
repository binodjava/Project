package com.oops.methodoverriding;

import com.oops.methodoverriding.p1.Hellob;

public class Lab517 {
	public static void main(String[] args) {

		Hainew hai = new Hainew();
		hai.show();
	}

}

class Xyz1 extends Hellob {
	protected void display() {
	}
}

class Hainew extends Hellob {
	void show() {
		Xyz1 ref = new Xyz1();
		ref.display();
	}
}
