package com.vishwa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDateVisaVersa {


	public static void main(String[] args) throws ParseException {
		
		String s="13/09/2015";
		String s1="15/09/2015";
		//d=day,M=Month,y=year,m=minute,s=second,H=Hour(0-23),h=(1-12),a=AM/PM,E=day name in week
		//If ‘M’ is 3 or more, then the month is interpreted as text, else number.
		SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");
		Date date=formater.parse(s);//String to Date
		System.out.println(formater.format(date));//Date to String
		Date date2=formater.parse(s1);
		System.out.println("days are:: "+( date2.getTime()-date.getTime())/(24*1000*60*60) );
		
		Calendar calender=Calendar.getInstance() ;
		System.out.println("date by calender:: "+calender.getTime());
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "7-Jun-2013";

		try {

			Date date1 = formatter.parse(dateInString);
			System.out.println(date1);
			System.out.println(formatter.format(date1));

		} catch (ParseException e) {
			e.printStackTrace();
		}



	}

}
