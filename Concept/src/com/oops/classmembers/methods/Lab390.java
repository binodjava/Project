package com.oops.classmembers.methods;

public class Lab390 {
	public static void main(String[] args) {
		Hello37 h = new Hello37();
		h.show(null);
		h.show("JLC");
		h.show(h);
	}

}

class Hello37 {
	void show(String str) {
		System.out.println("show(String)");
	}

	void show(Object str) {
		System.out.println("show(Object)");
	}
}


/*show(String)
show(String)
show(Object)*/