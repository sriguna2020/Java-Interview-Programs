package com.vishwa;

import java.util.Hashtable;
import java.util.Map;


public class Testt {

	
	public static void main(String[] args) {
		
		SingletonClass sc=SingletonClass.getSingleton();
		sc.method();
		//SingletonClass sc1=(SingletonClass) sc.clone();
		//System.out.println(sc.equals(sc1));
		String str;
		int fname;
		str = "Foolish boy.";
		//System.out.println(str.charAt(20)); //java.lang.StringIndexOutOfBoundsException
		fname = str.indexOf("oo");
		System.out.println(fname);
		String ss="Welcome";
		ss.concat(" singh");
		if( ss.trim() == ss.trim() )
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
		int index = 1;
		Boolean [] test = new Boolean[3];
		Boolean data = test[index];
		System.out.println(data);
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		  }  
	
	}

}
