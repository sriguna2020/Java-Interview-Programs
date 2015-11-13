package com.vishwa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class RandomMethod extends Random {
	@SuppressWarnings("unchecked")
	public static void main(String[]args)
	{
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
		double ran=ramd(23,30);
		float f=2.3f;
		int i=(int) (1.0/0.0);
		System.out.println("i is "+i);
		//double d=1/0;
		double d=1.0/0;
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
	
		System.out.println("d is "+d);
		System.out.println(Double.isInfinite(d));
		RandomMethod r=new RandomMethod();
		System.out.println(ran);
		int ranNum=new Random().nextInt(10);// No between 0(inclusive) to N(exclusive)
		System.out.println(ranNum);
		int ranNum1=r.next(100);// No between range of int
		System.out.println("random number "+ranNum1);
		Map map=new HashMap();
		System.out.println("A"+map.put("BC","33"));
		System.out.println("A"+map.put("BC","3389"));
		System.out.println("A"+map.put("BC","338"));
		HashSet hs=new HashSet();
		System.out.println("A"+hs.add(1));
		System.out.println("A"+hs.add(1));
		System.out.println(map);
		System.out.println(map.get("BC"));
	}
static double ramd(int min,int max)
  {
	double randam=Math.random()*(max-min)+min;
	return  randam;
  }
}


