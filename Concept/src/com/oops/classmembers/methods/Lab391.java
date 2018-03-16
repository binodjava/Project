package com.oops.classmembers.methods;

public class Lab391 {
	public static void main(String[] args) {
		Hello38 h = new Hello38();
		h.show("JLC");
		h.show(h);
	}

}

class Hello38 {
	void show(String str) {
		System.out.println("show(String)");
	}

	void show(Hello38 str) {
		System.out.println("show(Hello)");
	}
}



/*show(String)
show(Hello)
*/