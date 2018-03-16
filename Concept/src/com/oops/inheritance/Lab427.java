package com.oops.inheritance;

public class Lab427 {
	public static void main(String[] args) {
		System.out.println("Hello");

	}

}

class A5 extends B5 {// The hierarchy of the type A5 is inconsistent

}

class B5 extends A5 {// Cycle detected: a cycle exists in the type hierarchy
						// between B5 and A5
}

// Output: Hello
// But it's type of cyclic inheritance that is not supported in java, we should
// not use this kinf of relation
