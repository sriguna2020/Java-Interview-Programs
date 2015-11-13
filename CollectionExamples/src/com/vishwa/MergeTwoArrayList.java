package com.vishwa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoArrayList {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Integer []arr=new Integer[]{20,2,4,5,1};
		Integer []arr1=new Integer[]{10,2,4,3,6};
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr1));
		Set<Integer> set= new HashSet<Integer>();
		set.add(1);
		//list1.addAll(list);// A union B
		//list1.retainAll(list);// A intersection B
		//list1.removeAll(list); // arr1-arr( A-B)
		list.removeAll(list1);
		set.addAll(list1);
		int i=new Integer(12).intValue();
		//System.out.println(list1);
		System.out.println(list);
		System.out.println("A union B "+set);
		

	}

}
