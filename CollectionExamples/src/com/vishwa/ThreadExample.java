package com.vishwa;

class ThreadExample extends Thread {	
	public static void main(String[] args) throws InterruptedException {
		        final ThreadExample1 te =new ThreadExample1();
        System.out.println("HIIIIIIIIIII");
        te.sleep(3000);
        System.out.println(te.isInterrupted());
		

	}
}	
