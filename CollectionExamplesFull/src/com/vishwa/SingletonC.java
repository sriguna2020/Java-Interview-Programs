package com.vishwa;

import java.io.Serializable;

public class SingletonC implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private volatile static SingletonC instance = null;
	private SingletonC() {
		//if(singleton!=null)
			//throw new RuntimeException("Singleton already initialized");
	}
 
    public static SingletonC getInstance() {
        if (instance == null) {
        	synchronized (SingletonC.class) {    // double checked locking
        		if(instance==null)
        		{
        			instance = new SingletonC();
        		}
			}
            
        }
        return instance;
    }
    // to make the return same object after deserialization
    protected Object readResolve() {
        return instance;
    }
 
    private int i = 10;
 
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
}