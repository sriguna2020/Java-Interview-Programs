package com.vishwa;
import java.util.*;  
 class ArrayListExample extends ArrayList<Object> {  
	
	@Override
	public boolean add(Object obj)
	{
		System.out.println("Add() overrided here");
		return true;
	}
	static public final  void main(String args[]){ 
		//Array to ArrayList conversion
		String []str=new String[4];
		str[0] = "Cheese";
		str[1] = "Pepperoni";
		str[2] = "Black Olives";
		str[3] = "Vishwa";
		List<String> list=Arrays.asList(str);
		
		String []ar=list.toArray(new String[list.size()]);
		
		System.out.println("List to Array "+Arrays.toString(ar));
		
		String []array=list.toArray(new String[list.size()]);
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(list);
		System.out.println(list.get(3));
		//List to Array
		String []str2=(String[]) list.toArray();
		for(int i=0;i<str2.length;i++)
		System.out.print(str2[i]+" ");
		
		List<Object> al=new ArrayListExample();//creating arraylist  
		//al.add("Ravi");//adding object in arraylist  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Vijay");  
		//al.add(1,"vishwa"); 
		//al.add(1,"vishwa"); 
		//Collections.sort(al);
		//System.out.println(al.get(al.size()-1));
		
//		al=Collections.synchronizedList(al);
		//Here al is synchronized object
		System.out.println(al);
		//
		Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		while(itr.hasNext()){  
			System.out.print(itr.next()+" ");  
		}  
	}  
}  