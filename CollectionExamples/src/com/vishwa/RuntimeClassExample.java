package com.vishwa;

import java.io.IOException;

public class RuntimeClassExample {
	public static void main(String[]arg) throws IOException
	{
		Runtime r=Runtime.getRuntime();
		//r.exec("notepad");
		r.exec("cmd.exe /c start command");
		//r.halt(0);
		//r.exit(0);
		System.out.println("Total Memory: "+r.totalMemory());  
		System.out.println("Free Memory: "+r.freeMemory());  

		for(int i=0;i<20000;i++){  
			new RuntimeClassExample();  
		}  
		
		System.out.println("available processes in CPU are:"+r.availableProcessors());
		System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		System.gc();  
		System.out.println("After gc(), Free Memory: "+r.freeMemory());  

	}

}
