package com.vishwa;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {

	public static  void main(String[] args) {
		Integer []in={1,2,3,4,5,10};
		Float []fl={1.2f,2.3f,3.4f,4.6f,5.5f, 10.4f};
		Double []du={1.2,2.3,3.4,4.6,5.5, 112.4};
		List list1=Arrays.asList(in);
		List list2=Arrays.asList(fl);
		List list3=Arrays.asList(du);
		//System.out.println(list);
		//Object res=findMax(list);
		System.out.println("Max of Integer array is "+findMax(in));
		System.out.println("max of Integer array by List is "+findMax(list1));
		System.out.println("max of Float array by List   is "+findMax(list2));
		System.out.println("max of Double array by List  is "+findMax(list3));
	}
	public static <E extends Comparable<E> > E findMax(List<E> list)
	{
		E max=list.get(0);
		for(int i=1;i<list.size();i++)
		{
			if(list.get(i).compareTo(max) >0)
			{
				max=list.get(i);
			}
		}
		return max;
	}
	public static <E extends Comparable<E> > E findMax(Object []obj)
	{
		E max=(E)obj[0];
		for(int i=1;i<obj.length;i++)
		{
			if( ((E)obj[i]).compareTo(max) >0)
			{
				max=(E)obj[i];
			}
		}
		return max;
	}
}
