package com.oops.classmembers.methods;

public class Lab401 {
	public static void main(String[] args) {
		Hello46 h = new Hello46();
		h.sum(new int[0]);
		h.sum(new int[] { 12, 34, 54 });
		h.sum(new int[] { 10, 20, 50, 30, });
		// h.sum();
		// h.sum(12,34,54);
		// h.sum(10,20,50,30);

	}

}


//If we've defined array as an parameter of a method
//then only array we can pass, we can't pass normal sequence of values

class Hello46 {
	void sum(int arr[]) {
		System.out.println("sum(int[])");
		System.out.println("Length :" + arr.length);
		int s = 0;
		for (int a : arr) {
			s = s + a;
		}
		System.out.println("Sum is :" + s);
	}
}


/*sum(int[])
Length :0
Sum is :0
sum(int[])
Length :3
Sum is :100
sum(int[])
Length :4
Sum is :110*/
