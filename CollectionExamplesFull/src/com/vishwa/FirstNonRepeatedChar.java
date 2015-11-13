package com.vishwa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedChar {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String ss="wtweeat";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		Set<Character> set=new HashSet<Character>();
		char []c=ss.toCharArray();
	
		for(int i=0;i<c.length;i++)
		{
			if(map.containsKey(c[i]))
			{
				map.put(c[i], map.get(c[i])+1);
			}
			else
				map.put(c[i], 1);
		}
		System.out.println(map);
		for(int i=0;i<c.length;i++)
		{
			if(map.get(c[i])==1){
				System.out.println("FirstNonRepeatedChar by map "+c[i]);
			break;
			}
		}

	}

}
