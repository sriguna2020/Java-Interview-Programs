package com.vishwa;
class Test
{
	public void print(Object  o)
	{
		System.out.println("print object");
	}
	public void print(String o)
	{
		System.out.println("print string");
	}
	// will cause CTE
	/*public void print(Integer o)
	{
		System.out.println("print Integer");
	}*/
	public void print(double [] o)
	{
		System.out.println("print primmitive");
	}
}
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t=new Test();
		//t.print(null);
		//t.print(12);

	}

}
