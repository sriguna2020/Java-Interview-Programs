package com.vishwa;

public class FindDigits {

	
	public static void main(String[] args) {
		
		String ss="wrerer12134$%#$%";
		char []cc=ss.toCharArray();
		String s="";
		int count=0;
		//System.out.println(cc[0]);
		//System.out.println(String.valueOf(cc[0]));
		for(int i=0;i<cc.length;i++)
		{
			if(48<=(int)cc[i]&&(int)cc[i]<=57)
			{
				count=1;
				s=s+String.valueOf(cc[i]);
			}
			else
			{
				if(count==1)
					break;
			}
		}
		System.out.println(s);

	}

}
