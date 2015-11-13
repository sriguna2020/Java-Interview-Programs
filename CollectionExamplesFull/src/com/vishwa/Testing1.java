package com.vishwa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Testing1 {
	 
    public static String foo(){
        System.out.println("Test foo called");
        return "";
    }
    /*public static String toString(){
        System.out.println("Test toString called");
        return "";
    }*/
     
    public static void main(String args[]){
        Testing1 obj = null;
        System.out.println(obj.foo());
        int []arr={1,22,3,4,5};
        List list=new ArrayList();
        System.out.println(list);
        int [] arrr=new int[]{1,2,3,4,5};
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String s3 = "JournalDev";
        int start = 44;
        char end = 5;
        System.out.println(start+end);
        //System.out.println(start+s3);
        System.out.println(end+start);
        String str = null;
        String str1="abc";
        Boolean flag=null;
        try {
            if (flag) {
                while (true) {
                }
            } else {
                System.exit(0);
            }
        } finally {
            System.out.println("In Finally");
        }
        // good question
        System.out.println(str1.equals("abc") || str.equals(null));
       // System.out.println(s3.substring(start, end));
        HashSet shortSet = new HashSet();
        for (int i = 0; i < 10; i++) {
            shortSet.add(i);
            System.out.print(shortSet.remove(i-1));
        }
        System.out.println(shortSet.size());
        
    }
}