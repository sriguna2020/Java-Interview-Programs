package com.vishwa;

public class StringToString {
	@Override
	public  String toString()
	{
		
		return "singh";
	}
	
	public static void main(String[]args)
	{
		String s = "gh";
		String ss=new String("my nme is baghel");
		System.out.println(s);
		System.out.println(ss);
		String s1=new String("hello");  
		String s2=null; 
		String s33=new String("h");
		s33=s2;
		StringBuffer sb=new StringBuffer("h");
		sb.append('h');
		System.out.println(sb);
		//s33.concat("ji");
		System.out.println(s33);
		String s3=s1.intern();//returns string from pool if present if not then it will create new string as s1, now it will be same as s2  
		System.out.println(s3);
		System.out.println(s1==s3);//false because reference is different  
		System.out.println(s1==s3);//true because reference is same  
		
		String s11="java-string+split method by javatpoint";  
		String[] words=s11.split("\\s");//splits the string based on space \\ is called scape sequence
		//String[] words=s11.split("\\-");//splits the string based on - 
		//String[] words=s11.split("\\+");//splits the string based on +
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
	}
		int value=30;  
		String s12=String.valueOf(value);  
		System.out.println(s12+10);//concatenating string with 3010  
		
		String name="sonoo"; 
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.3343);
		String sf3=String.format("value is %1.12f",32.33434);//returns 12 char fractional part filling with 0  
		String sf4=String.format("value is %d",32); 
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3); 
		System.out.println(sf4); 
		int a=10;
		System.out.println(new Integer(a).doubleValue());
		
	}
}
