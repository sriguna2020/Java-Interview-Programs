package com.vishwa;

public class CountNumberOfWords {
	public static void main(String[]args)
	{
		String ss=" my name is vishwa baghel ";
		String[]words=ss.trim().split(" ");
		System.out.println(words.length);
		//char c[]=new char[ss.length()];
		char c[]=ss.trim().toCharArray();
		int count=0;
		int flag=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
			count++;
			}
			
		}
		System.out.println(count+1);
	}

}
