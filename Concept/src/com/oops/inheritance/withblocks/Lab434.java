package com.oops.inheritance.withblocks;

public class Lab434 {
	public static void main(String[] args) {
		Hello5 hello = new Hello5();
	}

}

/*Hai->SB
Hello->SB
Hai->IB
Hello->IB*/

// Always, blocks executions starts from parent->child class




class hai5 {
	{
		System.out.println("Hai->IB");
	}
	static {
		System.out.println("Hai->SB");
	}
}

class Hello5 extends hai5 {
	{
		System.out.println("Hello->IB");
	}
	static {
		System.out.println("Hello->SB");
	}
}