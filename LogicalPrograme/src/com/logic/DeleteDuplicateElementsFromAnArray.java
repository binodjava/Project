package com.logic;

public class DeleteDuplicateElementsFromAnArray {
	public static void main(String[] args) {
		 	int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
		

	}

	public static int removeDuplicateElements(int a[],int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
			}
			
		}
		 a[j++] = a[n-1];  
	        return j;  

	}

}
