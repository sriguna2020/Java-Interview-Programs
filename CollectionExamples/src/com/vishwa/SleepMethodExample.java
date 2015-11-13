package com.vishwa;

public class SleepMethodExample extends Thread
{
   public static void main(String[] args)
   {
	   SleepMethodExample producer = new SleepMethodExample();
	   SleepMethodExample consumer = new SleepMethodExample();
       
      producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
      consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority
      producer.setName("min");
      consumer.setName("max");
      
      producer.start();
     // producer.interrupt();
      consumer.start();
   }
   public void run()
   {
      for (int i = 0; i < 3; i++)
      {
         System.out.println(Thread.currentThread().getName()+"="+i);
         try {
			Thread.sleep(1000);
			//System.out.println(Thread.interrupted());
			//System.out.println(new Thread().isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }
   }
}
 
