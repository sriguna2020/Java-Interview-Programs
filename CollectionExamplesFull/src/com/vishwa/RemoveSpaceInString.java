package com.vishwa;

public class RemoveSpaceInString {

	public static void main(String[] args) {


		String ss="g  eeks     for ge  eeks  ";
		System.out.println(ss);
		char []c=ss.toCharArray();
		String res="";
		int count=0;
		int words=0;
		int len=c.length;
		for(int i=0;i<len;i++)
		{
			if(c[i]!=' ')
			{
				res=res+c[i];
				count++;
			}
		}
		System.out.println(res);
		System.out.println("number of characters is:"+count);
		

	}

}
