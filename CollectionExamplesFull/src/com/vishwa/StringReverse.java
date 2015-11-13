package com.vishwa;

public class StringReverse {

	
	public static void main(String[] args) {
		
		String str="vishwarup singh baghel";
		str=str+'\0';
		int len=0;
		char []c=str.toCharArray();
		for(int i=0;c[i]!='\0';i++)
		{
			len++;
		}
		System.out.println("length is "+len);
		for(int j=len-1;j>=0;j--)
		{
			System.out.print(c[j]);
		}
		len=0;
		//while(str.charAt(index))
		/*for(char cc:c)
		{
			len++;
		}
		System.out.println("length is "+len);*/
		
	}

}
