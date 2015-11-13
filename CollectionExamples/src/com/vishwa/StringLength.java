package com.vishwa;
public class StringLength
{
    static int i,c,res;
    
    static int length(String s)
    {
        try
        {
            for(i=0,c=0;0<=i;i++,c++)
            s.charAt(i);
        }
        catch(Exception e)
        //Array index out of bounds and array index out of range are different exceptions
        {
        	System.out.println(e);
            System.out.print("length is ");
            // we can not put return  statement in catch
        }
        return c;
    }
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        String ss="Hi baghel";
        int count=0;
        res=length("Alive is awesome ");
        System.out.println( res);
        char []c=ss.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        	count++;
        }
        System.out.println(count);
    }
}