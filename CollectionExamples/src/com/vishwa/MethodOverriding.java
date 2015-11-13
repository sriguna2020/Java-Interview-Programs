package com.vishwa;

class Some {
	protected void sum()
	{
		System.out.println("This is sum() of Parent");
		//return 2;
	}
}
public class MethodOverriding extends Some {
	//If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
	 protected void sum()
	{
		System.out.println("This is sum() of child class");
	}
	
	public static void main(String[] args) {
		MethodOverriding m= new MethodOverriding();
		Some s=new MethodOverriding();
		Some ss=new Some();
		m.sum();
		s.sum();
		ss.sum();
		
		
	}

}
