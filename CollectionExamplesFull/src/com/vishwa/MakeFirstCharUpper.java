package com.vishwa;

public class MakeFirstCharUpper {

	public static void main(String[] args) {
		
		String ss=" my Name   is baghel and You ";
		char c[]=ss.trim().toCharArray();
		for(int i=0;i<c.length;i++)
		{
			    if(i==0 &&c[i]>=97)
				c[i]=(char)(c[i]-32);
			    
				else if(c[i]==' ') {
					if(c[i+1]>=97)
					c[i+1]=(char)(c[i+1]-32);
			}
		}
		System.out.println(String.valueOf(c));
	}
}
