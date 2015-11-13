package com.vishwa;

public class MostTrickyQuestion {
	
	 public static String foo(){
	        System.out.println("Test foo called");
	        return "";
	    }
	     
	    public static void main(String args[]){
	    	MostTrickyQuestion obj = null;
	        System.out.println(obj.foo());
	    }

}
/*Ideally Java API should have given error when a static method is called from an object rather than giving warning, 
but I think it’s too late now to impose this. And most strange of all is that even though obj is null here, 
when invoking static method it works fine. I think it’s working fine because Java runtime figures out that 
foo() is a static method and calls it on the class loaded into the memory and doesn’t use the object at all, 
so no NullPointerException.*/