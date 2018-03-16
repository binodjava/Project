package com.oops.methodoverriding;

import com.oops.methodoverriding.p1.Hellob;

public class Lab516 {
	public static void main(String[] args) {
		Haib hai=new Haib();
		hai.show();
		
	}

}
class Xyz extends Hellob{}
class Haib extends Hellob{
	void show(){
		Xyz ref=Xyz();
		ref.display();
	}
}
