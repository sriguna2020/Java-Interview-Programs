package com.vishwa;

import java.util.ArrayList;
import java.util.List;

public class WhileLoopPerformanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<Integer>();
		long startTime;
		long endTime;
		int i;
		startTime=System.currentTimeMillis();
		for(i=0;i<1000000;i++)
		{
			list.add(i);
		}
		endTime=System.currentTimeMillis();
		System.out.println("Time in for loop "+(endTime-startTime));
		startTime=System.currentTimeMillis();
		i=0;
		while(i<1000000)
		{
			list.add(i);
			i++;
		}
		endTime=System.currentTimeMillis();
		System.out.println("Time in while loop "+(endTime-startTime));
	}

}
