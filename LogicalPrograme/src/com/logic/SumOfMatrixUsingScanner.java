package com.logic;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMatrixUsingScanner {
	public static void main(String[] args) {
		matrixAddition();

	}

	public static int[][] matrixAddition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the order of matrix");
		int m = scan.nextInt();
		int n = scan.nextInt();

		int firstMatrix[][] = new int[m][n];
		int secondMatrix[][] = new int[m][n];
		int sumOfMatrix[][] = new int[m][n];

		System.out.println("Enter the elements of first matrix");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				firstMatrix[i][j] = scan.nextInt();
		System.out.println("First Matrix is :" +Arrays.deepToString(firstMatrix));// only applicable for 2D array

		System.out.println("Enter the elements of second matrix");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				secondMatrix[i][j] = scan.nextInt();

		System.out.println("Second Matrix is :" + Arrays.deepToString(secondMatrix));

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sumOfMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; // use
																			// -
																			// for
																			// subtraction
				System.out.print(sumOfMatrix[i][j] + " ");
			}
			System.out.println();// new line
		}

		scan.close();
		return sumOfMatrix;

	}

}


/*
TestCase:-
Enter the order of matrix
2
2
Enter the elements of first matrix
1
2
3
4
First Matrix is :[[1, 2], [3, 4]]
Enter the elements of second matrix
1
2
3
4
Second Matrix is :[[1, 2], [3, 4]]
2 4 
6 8 
*/










