package com.vishwa;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[]args)
	{
		// An array of String objects
		String[] array = new String[] { "First", "Second", "Third", "Fourth" };
		 
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(array));
		
		String[] arr1 = new String[] { "Fifth", "Sixth" };
		String[] arr2 = new String[] { "Seventh", "Eight" };
		// An array of array containing String objects
		String[][] arrayOfArray = new String[][] { arr1, arr2 };
		// Print the array using default toString method
		System.out.println(arrayOfArray);
		 
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(arrayOfArray));
		 
		// Print the 2 D array using Arrays.deepToString()
		System.out.println(Arrays.deepToString(arrayOfArray));
	}

}
