package com.vishwa;

public class TryCatch {
	public static void main(String[]args)
	{
		int i=check();
		System.out.println(i);
	}
  static int check()
  {
	  try
		{
		  int num=12/0;
		  return 8;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			return 11;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 13;
		}
		finally
		{
			return 3;
		}
	  //return 5;
  }
}
