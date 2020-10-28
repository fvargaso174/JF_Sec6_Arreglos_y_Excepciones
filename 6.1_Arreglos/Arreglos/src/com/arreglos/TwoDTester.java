package com.arreglos;

import java.util.Scanner;

public class TwoDTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] nums = new int[3][2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println("Enter a value for row " + i + ", column " + j);
				nums[i][j] = in.nextInt();
			} // end for
		} // end for
		System.out.println("Imprimir Arreglo");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println("The value from row " + i + ", column " + j + " is: " + nums[i][j]);
			} // end for
		} // end for
	}// end main
}// end class TwoDTester