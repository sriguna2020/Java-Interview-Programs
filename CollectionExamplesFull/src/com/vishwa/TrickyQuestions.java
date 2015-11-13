package com.vishwa;

import java.util.HashSet;

public class TrickyQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//Integer x=40,y=40; // x==y is true if x and y is between -128 and 127 x=Integer.valueOf(40) it will cached by valueOf()
		Integer x=250,y=250;// x==y is false here compiler take as x=Integer.valueOf(250)
		if(x==y)
			System.out.println("x and y is same");
		else
			System.out.println("x and y is not same");
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
