package com.vishwa;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
public static void main(String[]args)
{
	/*Vector v=new Vector();
	v.add("hi");
	v.add("baghel");
	v.add("d");
	Iterator itr=v.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		//itr.remove();
		System.out.println(v.size());
	}
	System.out.println(v);
	Enumeration en=v.elements();
	while(en.hasMoreElements())
	{
		if(en.equals("hi"))
		v.add("singh");
		System.out.println(en.nextElement());
	}
	System.out.println(v);*/
	Vector<String> v=new Vector<String>();
    v.add("Amit");
    v.add("Raj");
    v.add("Pathak");
    v.add("Sumit");
    
    Enumeration<String> en=v.elements();

    while(en.hasMoreElements())
    {
        String value=(String) en.nextElement();
        System.out.println(value);
        if(value.equals("Amit"))
        v.add("hi");
        //v.remove(value);

    }
    
    Vector<String> vv=new Vector<String>();
    vv.add("Amit");
    vv.add("Raj");
    vv.add("Pathak");
    vv.add("Sumit");

    Iterator<String> it=vv.iterator();
    System.out.println("before remove vector:"+vv);
    while(it.hasNext())
    {
        String value=(String) it.next();
        System.out.println(value);
        if(it.next().equals("Raj"))
        it.remove();
    }
    System.out.println("after remove vector:"+vv);
   /* FileReader file = new FileReader("C:\\test\\a.txt");
    BufferedReader fileInput = new BufferedReader(file);
     
    // Print first 3 lines of file "C:\test\a.txt"
    for (int counter = 0; counter < 3; counter++) 
        System.out.println(fileInput.readLine());
     
    fileInput.close();*/
}
	
}
