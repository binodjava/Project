package com.corejava.literals;

public class Lab45 {
	public static void main(String[] args) {
		/*byte b = 128;//[byte range: -128 to 127]
		short s = 32768;//[short range: -32768 to 32767]
		int i = 2147483648;//[int range: -2147483648 to 2147483647]
		long l = 2147483648;//[have to add l OR L]
*/		
		
		byte b1 = (byte)128;System.out.println(b1);
		short s1 = (short)32768;System.out.println(s1);
		int i1 = (int)2147483648; //out of range
		int i2 = (int)2147483648l;
		
		long l1=2147483648l; 
		
//		2147483648l range is not coming uner int, so first have to convert in long and after that 
//		type cast it into int.
		
		
		

	}

}
