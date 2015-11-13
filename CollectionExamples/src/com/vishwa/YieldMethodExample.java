package com.vishwa;

public class YieldMethodExample
{
   public static void main(String[] args)
   {
      Thread producer = new Producer();
      Thread consumer = new Consumer();
       
      producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
      consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority
      
      consumer.start();
      Thread.yield();
      producer.start();
      
   }
}
 
class Producer extends Thread
{
   public void run()
   {
      for (int i = 0; i < 3; i++)
      {
         System.out.println("I am Producer : Produced Item " + i);
         //Thread.yield();
         /*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
      }
   }
}
class Consumer extends Thread
{
   public void run()
   {
      for (int i = 0; i < 3; i++)
      {
         System.out.println("I am Consumer : Consumed Item " + i);
         //Thread.yield();
         /*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
      }
   }
}
