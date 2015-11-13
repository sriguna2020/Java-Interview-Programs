package com.vishwa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterateByList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		Set<Entry<String, Integer>> set=map.entrySet();
		List<Entry<String, Integer> > list=new ArrayList<Entry<String, Integer>>(set);
		for(Entry<String, Integer> itr:list)
		{
			System.out.println("Key="+itr.getKey()+" Value="+itr.getValue());
		}

	}

}
