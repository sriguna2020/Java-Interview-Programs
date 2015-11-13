package com.vishwa;

class ThreadExample1  extends Thread {
	public void run()
	{
		/*for(int i=1;i<=5;i++)
		{
			if(Thread.currentThread().getName().equals("odd")){
				if(i%2!=0)
				System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			else {
				System.out.println(i);
			}
		}*/
		if(Thread.currentThread().getName().equals("odd"))
		{
			//System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=5;i++){
				if(i%2!=0)
					System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
		}
		else
		{
			//System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=5;i++){
				if(i%2==0) 
					System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  
			}
		}
	}
	
	public static void main(String[]args)
	{
		ThreadExample1 te=new ThreadExample1();
		ThreadExample1 tt=new ThreadExample1();
		te.setName("odd");
		te.start();
		tt.start();
	}
}	
