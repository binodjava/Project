package com.oops.classmembers.methods;

public class Lab369 {
	public static void main(String[] args) {
		Hello18 h = new Hello18();
		System.out.println(h.show(10));
	}

}

class Hello18 {
	boolean show(int x) {
		System.out.println("show()");
		return true;
	}
}

/*Output:-
show()
true*/
