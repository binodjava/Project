package com.oops.classmembers.methods;

public class Lab394 {
	public static void main(String[] args) {
		int x = 98;
		System.out.println("main begins :" + x);
		new Hello40().m1(x);
		System.out.println("main ends :" + x);

	}

}

class Hello40 {
	void m1(int x) {
		System.out.println("m1 begins :" + x);
		if (x != 0)
			m1(x /= 10);
		System.out.println("m1 ends :" + x);
	}
}




/*main begins :98
m1 begins :98
m1 begins :9
m1 begins :0
m1 ends :0
m1 ends :0
m1 ends :9
main ends :98*/


