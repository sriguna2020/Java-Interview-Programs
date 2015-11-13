package com.vishwa;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[]args)
	{
		Map mapA = new HashMap();
		Map mapB = new HashMap();
		mapA.put("key1", "element 1");
		mapA.put("key1", "element 23");
		mapA.put("key2", "element 2");
		mapA.put("key3", "element 3");
		mapA.put(1, 2);
		
		System.out.println(mapA);
		System.out.println(mapA.get("key11"));
		System.out.println(mapA.get(11));
		mapB.putAll(mapA);
		mapB.put(2,null);
		mapB.put(3,null);
		mapB.put(null,null);
		mapB.put(null,23);
		mapA.clear();
		System.out.println(mapA);
		System.out.println(mapB);
		Set entryset=mapB.entrySet();
		Set keyset=mapB.keySet();
		System.out.println(mapB.values());
		Collection st=mapB.values();
		System.out.println(st);
		Iterator itrk=keyset.iterator();
		while(itrk.hasNext())
		{
			System.out.println(itrk.next());
		}
		Iterator itr=entryset.iterator();
		while(itr.hasNext())
		{
			Entry entry= (Entry) itr.next();
			System.out.print(entry.getKey()+" ");
			System.out.print(entry.getValue()+" ");
		}
		
	}

}
