package com.vishwa;
public class JoinMethod extends Thread {
	
	public void run(){
        try {
            System.out.println(Thread.currentThread().getName() 
            		+ " is Started "+Thread.currentThread().getPriority());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is Completed");
        } catch (InterruptedException ex) {
        }
    }
	  
    public static void main(String args[]) throws InterruptedException{
      
        System.out.println("Thread "+Thread.currentThread().getName() 
        		+ " is Started "+Thread.currentThread().getPriority());
      
        JoinMethod jm = new JoinMethod();
        JoinMethod jm1 = new JoinMethod();
        JoinMethod jm2 = new JoinMethod();
        jm1.setPriority(2);
        
        jm.start();
        jm.join();
        jm1.start();
       // jm1.join();
        jm2.start();
        //jm2.join();
        System.out.println(Thread.currentThread().getName() + " is Completed");
    }
  
}

