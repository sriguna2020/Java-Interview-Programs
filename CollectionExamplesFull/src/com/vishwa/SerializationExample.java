package com.vishwa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable  {
	
	static public AAA aaa=new AAA() ;
	static public BBB bbb=new BBB();
	transient int x=2;
	static int y;
	String name="baghel";
	transient final String address = "DEL";// will serialized because it is final thats why interface variables are serialized
	//without implementing Serializable interface
	//Static variables value can be stored while serializing if the value is provided while initialization otherwise not
	static String com="JAARVIS";
//If variable is defined as Static and Transient both,than static modifier will govern the behavior of variable and not Transient.
	static transient String add="delhi";// will serialized
	public static void main(String[] args) throws  IOException, FileNotFoundException, ClassNotFoundException {
		SerializationExample ser=new SerializationExample();
		//Serialization process
		ser.y=3;
		ObjectOutput obj=new ObjectOutputStream(new FileOutputStream("obj.ser"));
		obj.writeObject(ser);
		obj.writeObject(aaa);
		obj.writeObject(bbb);
		obj.close();
		System.out.println("object serialized successfully");
		//DeSerialization process
		ObjectInput in=new ObjectInputStream(new FileInputStream("obj.ser"));
		SerializationExample ss=(SerializationExample) in.readObject();
		AAA aa=(AAA) in.readObject();
		aa.aa();
		BBB bb=(BBB) in.readObject();
		bb.bb();
		System.out.println(ss.x+" "+ss.com+" "+y+" "+ss.address);
		System.out.println("object deserialized successfully");
	}

}
