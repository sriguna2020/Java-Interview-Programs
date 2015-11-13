package com.vishwa;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterface {
	
	public static void main(String args[]) throws InterruptedException {
		  NavigableMap<String, Integer> navigableMap = new TreeMap<String, Integer>();
		  navigableMap.put("Larsen", 2);
		  navigableMap.put("Adani", 10);
		  navigableMap.put("Reliance", 10);
		  navigableMap.put("Tata Motors", 10);
		  navigableMap.put("Mahindra", 10);
		  navigableMap.put("Birla", 10);
		  
		  System.out.println("Last Key - "+navigableMap.lastKey());
		  System.out.println("First Key - "+navigableMap.firstKey());
		  System.out.println("Descending Key Set - " + navigableMap.descendingKeySet());
		  System.out.println("Navigable Key Set - " + navigableMap.navigableKeySet());
		  
		  System.out.println("Descending Map - " + navigableMap.descendingMap());
		  System.out.println("Head Map - " + navigableMap.headMap("Reliance"));
		  System.out.println("Head Map Including Key Passed - " + navigableMap.headMap("Reliance", true));
		  
		  System.out.println("Tail Map Including Key Passed - " + navigableMap.tailMap("Reliance"));
		  System.out.println("Tail Map Without Key Passed - " + navigableMap.tailMap("Reliance", false));
		  
		  System.out.println("Sub Map Including toKey - " + navigableMap.subMap("Larsen", "Tata Motors"));
		  System.out.println("Sub Map without toKey and fromKey - " + navigableMap.subMap("Larsen", false, "Tata Motors", false));
		  
		  System.out.println("Ceiling Key - " + navigableMap.ceilingKey("Reliance"));
		  System.out.println("Floor Key - " + navigableMap.floorKey("Reliance"));
		  System.out.println("Higher Key - " + navigableMap.higherKey("Reliance"));
		  System.out.println("Lower Key - " + navigableMap.lowerKey("Reliance"));
		  
		  System.out.println("Ceiling Entry - " + navigableMap.ceilingEntry("Reliance"));
		  System.out.println("Floor Entry - " + navigableMap.floorEntry("Reliance"));
		  System.out.println("Higher Entry - " + navigableMap.higherEntry("Reliance"));
		  System.out.println("Lower Entry - " + navigableMap.lowerEntry("Reliance"));
		  
		  System.out.println("Poll First Entry - " + navigableMap.pollFirstEntry());
		  System.out.println("Poll Last Entry - " + navigableMap.pollLastEntry());
		 }

}
