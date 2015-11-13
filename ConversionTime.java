package com;

import java.util.Arrays;
import java.util.Scanner;

public class ConversionTime {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	        //String date=sc.nextLine();
		String ss="04:59:59AM";
		String conDate="";
		String H="";
		String []dat=ss.split(":");
		String s=dat[2].substring(0,dat[2].indexOf("M")-1);
		Integer h=Integer.valueOf(dat[0]);
		if(h<12 &&(dat[2].contains("PM")))
		{
			h=h+12;
			H=String.valueOf(h);
		}
		else if(h==12 &&(dat[2].contains("AM")))
		{
			H="00";
		}
		 else
	        {
	            if(h<10)
	                H="0"+String.valueOf(h);
	            else 
			        H=String.valueOf(h);
	         }
		conDate=H+":"+dat[1]+":"+s;
		System.out.println(conDate);
	}

}
