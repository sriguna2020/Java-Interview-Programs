package com.vishwa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeListAndMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s[]={"A","B","C"};
		List list=new ArrayList(Arrays.asList(s));
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "D");
		map.put(2, "E");
		map.put(3, "F");
		for(int i=0;i<list.size();i++)
		{
			map.put(i, (String)list.get(i));
		}
		System.out.println(map);
		//map.put(null, "G");
		//map.put(null, "H");
		/*for(Object obj:map.values() )
		{
			list.add(obj);
		}
		System.out.println(list);*/
		list.addAll(map.entrySet());
		
		/*System.out.println(list);
		for(Object obj:list)
		{
			System.out.print(obj+" ");
		}*/

	}

}
