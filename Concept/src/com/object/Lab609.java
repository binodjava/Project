package com.object;

public class Lab609 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hai hai = new Hai(10);
		Hello h1 = new Hello(20, hai);
		Hello h2 = (Hello) h1.clone();
		h1.show();
		h2.show();
		System.out.println("---------------");
		System.out.println(h1 == h2);
		System.out.println(h1.hai == h2.hai);//pointing to same address
//		if modify in one, will reflet in other as well
		h2.y = 30;
		h1.show();
		h2.show();
		System.out.println("---------------");
		h2.hai.x = 111;
		h1.show();
		h2.show();
	}

}

class Hai {
	int x;

	Hai(int x) {
		this.x = x;
	}
}

class Hello implements Cloneable {
	int y;
	Hai hai;

	Hello(int y, Hai hai) {
		this.y = y;
		this.hai = hai;
	}

	void show() {
		System.out.println("Hello->y :" + y);
		System.out.println("Hai->x :" + hai.x);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}


/*We can say, no 100% copy is done in shaallow copy ie. default copy
If you modify data in members it will reflet in other as well
coz, both are pointing the same address*/
















