package com.corejava.controlstatements;

public class Lab195 {
	public static void main(String[] args) {

		int a;
		char ch;
		float f;
		String str;
		for (a = 5, ch = 'a', f = 123456.78F, str = ""; a >= 0; a--, ch++, f /= 10, str += ch) {
			System.out.println(a + "\t" + ch + "\t" + f + "\t" + str);
		}
	}

}

/*5	a	123456.78	
4	b	12345.678	b
3	c	1234.5677	bc
2	d	123.45677	bcd
1	e	12.345677	bcde
0	f	1.2345678	bcdef*/