package com.vishwa;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {
    
    public static void main(String[] args)
    {
        
        System.out.println("Please enter the input string :" );
        Scanner in = new Scanner (System.in);
       // String s=in.nextLine();
        /*char c=firstNonRepeatedCharacter(s)!=null?firstNonRepeatedCharacter(s):'N';
        System.out.println("The first non repeated character is :  " + c);*/
        String input ="tweeat";
        System.out.println(input);

        for(char i :input.toCharArray()){
        if(input.indexOf(i)==input.lastIndexOf(i)){
        	//System.out.println(input.indexOf(i)+" and "+input.lastIndexOf(i));
        System.out.println(i);
        break;
        }
        }
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable= 
                     new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        // Search characterhashtable in in order of string str
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        return null ;
    }
} 
