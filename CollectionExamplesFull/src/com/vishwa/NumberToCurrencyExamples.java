package com.vishwa;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberToCurrencyExamples {
	public static void main(String[]arga)
	{
		 Double currencyAmount = new Double(123456789.555);
		//Locale currLocale=Locale.getDefault();
		Locale currLocale=Locale.CHINA;
		Currency currCurrency=Currency.getInstance(currLocale);
		NumberFormat currformetter=NumberFormat.getCurrencyInstance(currLocale);
		
		System.out.println(currLocale.getDisplayName());
		System.out.println(currCurrency.getCurrencyCode());
		System.out.println(currformetter.format(currencyAmount));
	}

}
