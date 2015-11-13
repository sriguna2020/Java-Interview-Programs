package com.vishwa;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityMapExample {

	public static void main(String[] args) {
		Map identityMap = new IdentityHashMap();
		Map hashMap = new HashMap();
		identityMap.put("a", 1);
		identityMap.put(new String("a"), 2);
		identityMap.put("a", 3);

		hashMap.put("a", 1);
		hashMap.put(new String("a"), 2);
		hashMap.put("a", 3);
		System.out.println(identityMap);
		System.out.println(hashMap);
		//System.out.println();
		System.out.println("Identity Map KeySet Size :: " +  identityMap.keySet().size());
		System.out.println("Hash Map KeySet Size :: " + hashMap.keySet().size());
		String s1="Bgahel";
		String s2=new String("baghel");
		String s3=s1;
		System.gc();
		System.out.println(s3.equals(s1));
		System.out.println(s3==s1);
	}
}
