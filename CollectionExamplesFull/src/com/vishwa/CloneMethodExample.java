package com.vishwa;

class AA
{	
}
class B extends AA
{
}
public class CloneMethodExample extends B implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethodExample c=new CloneMethodExample();
		System.out.println(c);
		CloneMethodExample c1=(CloneMethodExample) c.clone();
		System.out.println(c1);
		AA aa=(AA) c.clone();
		B b=(B) c.clone();
		System.out.println(aa);
		System.out.println(b);
		long x=100000000000L;
		int y=(int)x;
		System.out.println(y);
	}

}
