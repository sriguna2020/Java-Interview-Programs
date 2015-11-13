package com.vishwa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Simple 
{
	public void print()
	{
		System.out.println("this is print method...");
	}
}

public class CreatingObjectManyWays implements Cloneable  {
	public static void main(String[] args)  {
		
		//1st ways
		Simple c1=new Simple();
		c1.print();
		Class clas;
		try {
			clas = Class.forName("com.vishwa.Simple");
			//2nd ways
			Simple c2=(Simple) clas.newInstance();
			c2.print();
			//3rd ways
			Simple c3=(Simple) c1.getClass().getClassLoader().loadClass("com.vishwa.Simple").newInstance();
			c3.print();
			//4th ways 
			CreatingObjectManyWays c4 = (CreatingObjectManyWays) new CreatingObjectManyWays().clone();
			
			//5th ways
			// create an ObjectInputStream for the file we created before
			FileOutputStream out = new FileOutputStream("D:\\simple.ser");
			ObjectOutputStream oout = new ObjectOutputStream(out);
			 
			// write something in the file
			oout.writeObject(c1);
			oout.flush();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Simple.ser"));
			Simple c5 = (Simple) ois.readObject();
			c5.print();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
