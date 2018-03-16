package com.oops.assessmodifiers.p3;

public class Lab491 {
	public static void main(String[] args) {
		A4 aobj = new A4();
		aobj.setX(99);
		System.out.println(aobj.getX());//99
	}

}

class A4 {
	private int x;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}
}
