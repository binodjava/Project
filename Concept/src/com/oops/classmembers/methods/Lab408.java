package com.oops.classmembers.methods;

public class Lab408 {
	public static void main(String[] args) {
		Hello53 h=new Hello53();
		h.show(10);

	}

}

class Hello53{
	void show(int[]...arr){
		System.out.println("\nshow(int[]...)");
	}
}