package com.vishwa;
import java.util.HashMap;

public class LoadFactorConcept {

	public static void main(String[] args) {

		HashMap <Integer,String> map =new HashMap<Integer,String>();
		//initial capacity is 16 so 16*0.75= 12 threshold
		map.put(1, "Sandeep");
		map.put(2, "sangeeta");
		map.put(3, "Surabhi");
		map.put(4, "Sumanta");
		map.put(5, "Ram");
		map.put(6, "Shyam");
		map.put(7, "Rohan");
		map.put(8, "Tapan");
		map.put(9, "Hari");
		map.put(10, "Simon");
		map.put(11, "Joseph");
		map.put(12, "Heena");
		map.put(13, "Karan");
		map.put(14, "sujain");
		System.out.println(map);
	}
	
}