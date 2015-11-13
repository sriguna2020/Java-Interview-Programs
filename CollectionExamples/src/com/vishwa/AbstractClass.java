package com.vishwa;
abstract class AbstractExample {

	public AbstractExample(){
		System.out.println("In AbstractExample()");
	}
	abstract void print1();
	 void print()
	{
		System.out.println("This is print()");
	}
}

public class AbstractClass extends AbstractExample{
	public void print1()
	{
		System.out.println("This is print1()");
	}
	public static void main(String args[]){
		AbstractClass obj=new AbstractClass();
		System.out.println(obj);
		obj.print();
		obj.print1();

	}
}