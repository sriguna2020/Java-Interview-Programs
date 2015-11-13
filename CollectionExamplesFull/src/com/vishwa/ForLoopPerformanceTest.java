package com.vishwa;
import java.util.Calendar;
import java.util.*;
 
public class ForLoopPerformanceTest
{
    private static List<Integer> list = new ArrayList<Integer>();
    private static long startTime;
    private static long endTime;
    static int i=0;
    static
    {
        for(; i < 10000000; i++)
        {
            list.add(i);
        }
    }
    @SuppressWarnings({ "unused", "rawtypes" })
    public static void main(String[] args)
    {
        //Type 1
        startTime = Calendar.getInstance().getTimeInMillis();
        for(Integer i : list)
        {
            //
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For each loop :: " + (endTime - startTime) + " ms");
 
        //Type 2
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int j = 0; j < list.size() ; j++)
        {
            //
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");
 
        //Type 3
        startTime = Calendar.getInstance().getTimeInMillis();
        int size = list.size();
        for(int j = 0; j < size ; j++)
        {
        	
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using int size = list.size(); [int j = 0; j < size ; j++] :: " + (endTime - startTime) + " ms");
        System.currentTimeMillis();
        //Type 4
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int j = list.size(); j > 0 ; j--)
        {
        	
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms");
      //Type 5
        startTime = Calendar.getInstance().getTimeInMillis();
        int j = 0;
        while(j<=size)
        {
        	j++;
        	
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using while loop " + (endTime - startTime) + " ms");
        startTime = Calendar.getInstance().getTimeInMillis();
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        	itr.next();
        	
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using iterator() method " + (endTime - startTime) + " ms");
    }
}