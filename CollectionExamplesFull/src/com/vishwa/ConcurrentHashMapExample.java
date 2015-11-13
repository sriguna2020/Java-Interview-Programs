package com.vishwa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample{

	public static void main(String[] args) {

		//ConcurrentHashMap
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		Iterator<String> it = myMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) 
			myMap.put(key+"new", "new3");
			System.out.print(key+" ");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);

		//HashMap
		myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		Collection<String> list=myMap.values();
		Iterator itrr=list.iterator();
		while(itrr.hasNext())
		{
			System.out.print(itrr.next()+" ");
		}
		System.out.println(myMap.values());
		
		for(Map.Entry entry:myMap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			if(key.equals("3")) {
				//myMap.put(key+"new", "new3");
				//break;// It will not allow for HashMap 
				//myMap.put(key, "new3");
			}
		}
		System.out.println("HashMap after iterator: "+myMap);
	}

}