package com.vishwa;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[]args)
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(34,"vishwa");
		map.put(2, "Singh");
		map.put(3, "Baghel");
		System.out.println("HasMap type "+map);
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>(map);
		SortedMap<Integer,String> smap= new TreeMap<Integer,String>(map);
		System.out.println(smap);
		System.out.println("TreeMap in ascending order by key "+tmap);
		
		System.out.println("TreeMap in descending order by key "+tmap.descendingMap());
		NavigableMap original = new TreeMap();
		original.put("1", "1");
		original.put("2", "2");
		original.put("3", "3");

		//this headmap1 will contain "1" and "2"
		SortedMap headmap1 = original.headMap("3");
		System.out.println(headmap1);
		//this headmap2 will contain "1", "2", and "3" because "inclusive"=true
		NavigableMap headmap2 = original.headMap("3", true);
		System.out.println(headmap2);
		//The tailMap() method works the same way, except it returns all elements that 
		// are higher than the given parameter element.opposite to headMap()
		
		
	}

}
