package com.vishwa;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.*;

public class WeakHashMapClass {
	
	@Override
	public void finalize(){
		System.out.println("object is garbage collected");
		} 
	
	public static void main(String[]args) {
	
	Map<Person, String> wm = new WeakHashMap<Person, String>();
	Person person = new Person();
	person.setAge(25);
	person.setName("John");
	person.setAddress("Delhi");
	
	wm.put(person, person.getName());
	
	  
	Person person2 = new Person();
	person2.setAge(35);
	person2.setName("Anderson");
	wm.put(person2, person2.getName());
	
	System.out.println("Weak Hash Map :" + wm);

	person = null;
	System.gc();
	System.out.println("Weak Hash Map after nulling Person Object :" + wm.toString());
	String str="baghel";
	String st=str+"singh";
	str=null;
	System.gc();
	System.out.println(str);
	System.out.println(st);
	
	Map<String, String> stringWeakHashMap = new WeakHashMap<String, String>();
	String str1 = "Key 1";
	String str2 = "Key 2";
	  
	stringWeakHashMap.put(str1, "Value 1");
	stringWeakHashMap.put(str2, "Value 2");
	str1 = null;
	  
	System.gc();
	System.out.println("Weak Hash Map :" + stringWeakHashMap);

  }
}
