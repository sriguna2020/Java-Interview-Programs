package com.vishwa;

class One {
	 void print()
	{
		System.out.println("this is print() of One class");
	}
}
class Two extends One {
	
	public  void print()
	{
		System.out.println("This is static print() of class Two");
	}
	
}
class Three extends Two {
	
	public  void print()
	{
		System.out.println("This is static print() of class Three");
	}
	public Three(int a)
	{
		System.out.println(a);
	}
	public Three()
	{
		this(3);
	}
	
}
class Four extends Three {
	
	public Four(int a)
	{
		System.out.println(a);
	}
	public Four()
	{
		this(4);
	}
	
	/*public  void print()
	{
		System.out.println("This is static print() of class Four");
	}*/
	
}
public class StaticOverriding extends Four {
	/*public  void print()
	{
		System.out.println("This is  print() of class StaticOverriding");
	}*/

	public static void main(String[] args) {
		
		One one=new One();
		one.print();
		One one1=new Two();
		one1.print();
		int a=3&1;
		System.out.println(3>1&0<1);
		StaticOverriding so=new StaticOverriding();
		so.print();// it will call first print() of StaticOverriding if not then call immediate super class only
		

	}

}
