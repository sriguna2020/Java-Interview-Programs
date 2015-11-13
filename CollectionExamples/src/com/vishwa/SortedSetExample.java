package com.vishwa;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[]args)
	{
		SortedSet<Integer> sset=new TreeSet<Integer>();
		sset.add(23);
		sset.add(3);
		sset.add(2);
		sset.add(10);
		TreeSet<Integer> tset=new TreeSet<Integer>(sset);
		System.out.println(tset.descendingSet());
		System.out.println(sset);
		//System.out.println(tset.descendingIterator());
		Iterator<Integer> itr=tset.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
