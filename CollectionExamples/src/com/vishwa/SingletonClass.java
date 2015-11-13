package com.vishwa;

public class SingletonClass implements Cloneable {
	
	private volatile static SingletonClass singleton;
	//private static SingletonClass singleton=new SingletonClass() ;//early instantiation
	private SingletonClass() {
		//if(singleton!=null)
			//throw new RuntimeException("Singleton already initialized");
	}

	public static SingletonClass getSingleton()
	{
		if(singleton==null) {   // double checked locking type
			synchronized (SingletonClass.class) {
				if(singleton==null)
				{
					System.out.println("singleton object is creating now");
					singleton=new SingletonClass(); 
				}
			}
		}
		return singleton;
	}
	public Object clone() 
	{
		//throw new RuntimeException("Can not create clone of Singleton class”");
		return this;
	}
	public void method()
	{
		System.out.println("this is simple a method");
	}
	public static void main(String[]args) throws CloneNotSupportedException 
	{
		SingletonClass sc=getSingleton();
		SingletonClass sc12=new SingletonClass();
		SingletonClass sc1 = null;
			sc1 = (SingletonClass) sc.clone();
		
		System.out.println(sc.equals(sc1));
		System.out.println(sc.equals(sc12));
		sc.method();
		sc12.method();
	}

}
