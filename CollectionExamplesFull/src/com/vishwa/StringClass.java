package com.vishwa;

import java.util.HashMap;


public class StringClass {
	
	static int i;
	public static void main(String[] args) {
		
		String s=new String("singh");
		String sa="singh";
		String sb="singhvishwa";
		System.out.println(sa==sb);
		
		String ss=new String("singh");
	     ss= ss.concat("vish");
	     s=s.concat("vish");
	    //System.out.println(sss);
	    System.out.println(ss);
	    System.out.println(s==sb);
		System.out.println(s==ss);
		System.out.println(s.equals(ss));
		
		String regex="((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
		//String regex="[^a-zA-Z0-9']+";
		
		String regex1="[^a-z]+|[^0-9]+";
		
		String reg="abc123def456ghi789";
		
		/*System.out.println(reg.replaceAll("[a-zA-Z]", ""));
		System.out.println(reg);

		String aa[]=reg.split(regex);
		String aaa[]=reg.split(regex1);
		System.out.println(Arrays.toString(aaa));
		System.out.println(Arrays.toString(aa));*/
		String st="abD1276asgio90";
		char c[]=st.toCharArray();
		String sc="124";
		System.out.println(sc.charAt(sc.length()-1));
		for(char ch:c)
		{
			if(Character.isDigit(ch))
				System.out.print(ch+" ");
			else if(Character.isLetter(ch))
				System.out.print(ch+" ");
			else
				System.out.print(ch+" ");
		}
	}

}
