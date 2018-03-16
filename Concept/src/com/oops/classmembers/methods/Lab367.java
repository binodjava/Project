package com.oops.classmembers.methods;

public class Lab367 {
	public static void main(String[] args) {
		Hello16 h = new Hello16();
		System.out.println(h.show(10));
		
		/*OUTPUT:
		show()
		65*/

	}

}

class Hello16 {
	long show(int x) {
		System.out.println("show()");
		return 'A';//65
	}

}
