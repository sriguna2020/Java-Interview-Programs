package com.vishwa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimentionalArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array={
				      	{1,2,3},
				      	{4,5,6},
				      	{7,8,9}
		              };
		System.out.println(Arrays.deepToString(array));
		
	// initializing two dimensional array as literal 
	  String[][] names = { 
			{"John", "Smith"}, 
			{"Javin", "Paul"}, 
			{"James"}, 
			}; 
	  System.out.println("rows "+names.length);
	  System.out.println("cols "+names[0].length);
	  System.out.println(Arrays.deepToString(names));
	// how to initialize two dimensional array in Java 
	// using for loop 
	int [][]board=new int[4][4];
	int st[]=new int[4];
	int fth[]=new int[4];
	
	for (int i = 0; i < board.length; i++) { 
		for (int j = 0; j < board[i].length; j++) { 
			board[i][j] = i; 
			} 
		} 
	
	for (int i = 0; i < board.length; i++) { 
		if(i==0) {
		for (int j = 0; j < board[i].length; j++) { 
			st[j]=board[i][j]; 
			} 
		} 
		if(i==3) {
			for (int j = 0; j < board[i].length; j++) { 
				fth[j]=board[i][j]; 
				} 
			} 
	}	
	System.out.println("1st "+Arrays.toString(st));
	System.out.println("fth "+Arrays.toString(fth));
	// now let's print a two dimensional array in Java 
	
	for (int[] a : board) { 
		for (int i : a) { 
			System.out.print(i + " "); 
			} 
		System.out.println(""); 
		}
  }
}