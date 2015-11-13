package com.vishwa;

import java.util.HashSet;

public class TrickyQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		double f=2.3;
		float ii=(float) f;
		//2
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		//char s=1;
		System.out.println(start + end);
		System.out.println(end+start);
		System.out.println(s3.substring(start, end));
		//3
		HashSet shortSet = new HashSet();
		
		for (short i = 0; i < 100; i++) {
		shortSet.add(i);//here i autoboxing to Short object so set has Short type data
		shortSet.remove(i-1);// here (i-1) become Integer after eval. so remove() will not find any Integer so no deleting
		  } 
		System.out.println(shortSet.size());
		//4
		//Boolean flag=null;
		Boolean flag=false;
		//What will be the boolean “flag” value to reach the finally block?
		try {
			if (flag) {
			while (true) {
			}
			} else {
			//System.exit(1);
			}
			} finally {
			System.out.println("In Finally");
			}
		//5
		String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") || str.equals(str1));
		//System.out.println(str1.equals("abc") | str.equals(str1));// | will evaluate both literals so NullPointerException
		//6
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println(sb.equals(sb1));

	}

}
