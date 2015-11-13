package com.vishwa;

public final class ImmutableClass {
	final String pancard;
	public ImmutableClass(String pan)
	{
		this.pancard=pan;
	}
	public String getPancard()
	{
		return pancard;
	}
	public static void main(String[]ars)
	{
		String s=new String("Singh");
		String ss="";
		String sss="Singh".intern();
		System.out.println(s==ss);
		//System.out.println(ss==sss);
		System.out.println(ss==sss);
	}

}
/*The above class is immutable because:

The instance variable of the class is final i.e. we cannot 
change the value of it after creating an object.
The class is final so we cannot create the subclass means it can't inherited.
There is no setter methods i.e. we have no option to change the 
value of the instance variable.*/