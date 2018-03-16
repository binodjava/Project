package com.oops.classmembers.methods;

public class Lab366 {
	public static void main(String[] args) {
		Hello15 h = new Hello15();
		h.show(10);
		System.out.println("Hello");
	}

}

class Hello15 {
	int show(int x){//Type mismatch: cannot convert from long to int
		System.out.println("show()");
		return 12L;
		//return (int)12L;
// Method need int type, but we're returning long type
// we have to typecast long to int 
	}
}