package com.vishwa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Dolly1 {


	public static void main(String[] args) {

		String ss="010112120";
		String zero="";
		String one="";
		String two="";
		int a[]=new int[]{1,2,3};
		Integer at[]=new Integer[]{3,2,0,0,0,1,1,1,3,44};
		//Arrays.sort(at);
        System.out.println(Arrays.toString(at));
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);al.add(2);al.add(3);
		Integer []aa=al.toArray(new Integer[al.size()]);
		
		char c[]=ss.toCharArray();
		System.out.println(Arrays.toString(c));
		
		NavigableMap<Character, Integer> map=new TreeMap<Character,Integer>();
		for(char chh:c)
		{
			if(map.containsKey(chh))
			{
				map.put(chh, map.get(chh)+1);
			}
			else
			{
				map.put(chh, 1);
			}
		}
		//map=map.descendingMap();
		for(Entry<Character,Integer> itr: map.entrySet())
		{
			System.out.println(itr.getKey()+" occures "+itr.getValue()+" times");
		}
		System.out.println(map);
		/*for(char ch:c)
		{
			if(ch=='0')
				zero=zero+"0";
			else
				one=one+"1";
		}*/
		
		for(int i=0;i<ss.length();i++)
		{
		if(ss.charAt(i)=='0')
		  {
			zero=zero+String.valueOf(ss.charAt(i));
		  }
		else if(ss.charAt(i)=='1')
		{
			one=one+String.valueOf(ss.charAt(i));
		  }
		else
			two=two+String.valueOf(ss.charAt(i));
		}
		System.out.println(zero+one+two);
	}
	

}
