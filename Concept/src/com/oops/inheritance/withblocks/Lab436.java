package com.oops.inheritance.withblocks;

public class Lab436 {
	public static void main(String[] args) {

		Hello7.show();
	}

}

class Hai7 {
	static void show() {
		System.out.println("Hai->show()");
	}

	static {
		System.out.println("Hai->S.B");
	}
}

class Hello7 extends Hai7 {
	static {
		System.out.println("Hello->SB");
	}
}

/*Output:-
Hai->S.B
Hai->show()
?????????????????*/


