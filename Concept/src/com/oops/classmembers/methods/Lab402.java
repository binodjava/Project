package com.oops.classmembers.methods;

public class Lab402 {
	public static void main(String[] args) {
		Hello47 h=new Hello47();
		h.sum(new int[0]);
		h.sum(new int[] { 12, 34, 54 });
		h.sum(new int[] { 10, 20, 50, 30, });
		h.sum();
		h.sum(12,34,54);
		h.sum(10,20,50,30);
		
	}

}
class Hello47 {
	void sum(int...arr) {
		System.out.println("sum(int...)");
		System.out.println("Length :" + arr.length);
		int s = 0;
		for (int a : arr) {
			s = s + a;
		}
		System.out.println("Sum is :" + s);
	}
}

/*sum(int...)
Length :0
Sum is :0
sum(int...)
Length :3
Sum is :100
sum(int...)
Length :4
Sum is :110
sum(int...)
Length :0
Sum is :0
sum(int...)
Length :3
Sum is :100
sum(int...)
Length :4
Sum is :110
*/
