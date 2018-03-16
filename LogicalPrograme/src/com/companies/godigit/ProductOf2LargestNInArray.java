package com.companies.godigit;

import java.util.Arrays;

public class ProductOf2LargestNInArray {
	public static void main(String[] args) {
		//Logic 1: Finding largest no among a,b,c
		 /* int a=2,b=3,c=4;
		if(a>b&&a>c)
			System.out.println(a+" is largest");
		else if(b>a&&b>c)
			System.out.println(b+" is largest");
		else 
			System.out.println(c+" is largest");
			*/
		
		
		
		//Logic 2: Fijnding largest no from an array
		/*int temp=0;
		int[] a={1,2,3,4,5,6,7};
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
			
		}
		System.out.println("1st Largest no is: "+a[a.length-1]);
		System.out.println("2nd Largest no is: "+a[a.length-2]);
		System.out.println("3rd Largest no is: "+a[a.length-3]);
		System.out.println("=================================");
		System.out.println("1st two Largest no is: "+a[a.length-1]+" and "+ a[a.length-2]);
		System.out.println("1st three Largest no is: "+a[a.length-1]+" and "+ a[a.length-2]+" and "+ a[a.length-3]);*/
		
		
		
		
		
		
		//Logic 3: How to find 2nd largest number from an array
		/*int temp=0;
		int[] a={1,2,3,4,5};*/
		
		
		//Logic 4: How to find 3rd largest number from an array
		//Logic 3: How to find first two largest number from an array
		//Logic 3: How to find first three largest number from an array
		
		
		
		
		/*int a[]={-1, -3, -4, 2, 0, -5} ; 
		// we don't have to consider -ve value
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		System.out.println("1st Largest no is: "+a[a.length-1]);
		System.out.println("2nd Largest no is: "+a[a.length-2]);
		System.out.println("3rd Largest no is: "+a[a.length-3]);
		System.out.println("=================================");
		System.out.println("1st two Largest no is: "+a[a.length-1]+" and "+ a[a.length-2]);
		System.out.println("1st three Largest no is: "+a[a.length-1]+" and "+ a[a.length-2]+" and "+ a[a.length-3]);*/
		
		
		
		//WAP to find the product of 2 largest number in givne array in that negative values included
		
		
		
		//product of 2 largest number in givne array in that negative values included
		int temp=0,c = 0;
		int[] a={1,2,3,4,5,-6,-7};
		int x=a[0],y=a[1];
		for(int i=0;i<a.length-1;i++){
			if(a[i]*a[i+1]> x * y){
				c=a[i]*a[i+1];
				
			}
			
		}
		System.out.println("Product of 2 largest numbers : "+c);//end 
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
