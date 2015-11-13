package com.vishwa;

public class StringOperation
{
	public void finalize(){System.out.println("object is garbage collected");}  
	 
	public static void main(String[] args) 
	{
		 StringOperation t1=new StringOperation();  
		 StringOperation t2=new StringOperation(); 
		 StringOperation t3=new StringOperation(); 
		  t1=null;  
		  t2=t3;
		  new StringOperation();
		  System.gc(); 
		String s1=new String("hello");
		String s2=new String("hello");
		StringBuffer s5=new StringBuffer("hello");
		StringBuffer s6=new StringBuffer("hello");
		System.out.println("==="+s1.substring(3,3));
		String s3="hello";
		String s4="hello";
		/*System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s5.equals(s6));*/
		
		////////////////////////////////
		
		String s7=s1.intern();
		System.out.println(s7);
		System.out.println(s3==s7);
	
		String s8=s1.concat(" world");
		System.out.println(s8);
		String s9=s8.intern();
		System.out.println(s9);
		String s10="hello world";
		System.out.println(s8==s10);
		System.out.println(s9==s10);
//for a final variable we can't changed(assign new value) but can changed at same address
		final StringBuffer sb=new StringBuffer("chikansa");
		sb.append("meda");
		System.out.println(sb);//chikansameda
// for a immutable object we can't changed value at same address we can changed value to assign new variable		
		String s11="hello";
		s11=s11.concat("menda");
		String sa=null;
		System.gc();
		System.out.println(s11);
		
		String s12=s11+" world";
		System.out.println(s11==s10);
	}
}
