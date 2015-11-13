package com.vishwa;
import java.util.*;  
public class TreeMapExample {
	 public static void main(String args[]){  
	   
	  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(99,"Rahul"); 
	  //hm.put(null,"Rahul");
	  hm.put(78,null);
	  hm.put(88,null);
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}  
