package com.manejodeerrores;

import java.util.Scanner;

public class ManejoDeErrores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		int[] nums = new int[10];
		try {
			for (i = 0; i < 11; i++) {

				System.out.println("Enter a value for row " + i);

				if (i > 9 || i < 0)
					throw new Exception("Index " + i + " is out of bounds!");
				nums[i] = in.nextInt();

			} // end for
				// i is the index of an array with length 10
		} // end try
		catch (Exception e) {
			// This code will run only if the exception was thrown
			if (i > 9)
				i -= 9;
			else
				i += 9;
		} // end catch
			// You may have additional code here that will run only if the exception was not
			// thrown

	}

}
