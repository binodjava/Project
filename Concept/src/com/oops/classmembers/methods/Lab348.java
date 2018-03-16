package com.oops.classmembers.methods;

public class Lab348 {
	public static void main(String[] args) {
	Hello1.show();//we can't call instance methos by class name	
	}

}
class Hello1{
void show(){
	System.out.println("show()");
}
}