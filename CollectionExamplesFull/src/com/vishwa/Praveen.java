package com.vishwa;

public class Praveen {
	String str;
	Praveen(String st)
	{
		str=st;
	}
	public void run()
	{
		System.out.println(str);
	}
	public static void main(String[]args)
	{
		new Praveen("hh");
		new Praveen("dd");
	}
}
