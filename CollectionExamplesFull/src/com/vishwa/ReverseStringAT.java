package com.vishwa;

public class ReverseStringAT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input="AliveisAwesome";
		  StringBuilder input1 = new StringBuilder("hi");
		  //input1=input1+"j"
		  System.out.println(input1+"j");
		  input1.append(input);
		  System.out.println(input1);
		  input1=input1.reverse(); 
		
		String ss="my name is baghel";
		char []c=ss.toCharArray();
			String s="";
			for(int k=0;k<c.length;k++)
			{
				while(c[k]!=' '){ 
				s=s+c[k];
				}
			}
			String revs="";
			for(int j=s.length()-1;j>=0;j--)
			{
				revs=revs+s.charAt(j);
			}
			System.out.print(revs+" ");
			
		/*String []words=ss.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				rev=rev+words[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);*/

	}

}
