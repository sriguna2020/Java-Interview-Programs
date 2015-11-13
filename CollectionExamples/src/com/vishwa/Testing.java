package com.vishwa;
class Testing{  
    final int id;  
    final String name;  
    int age;  
    Testing(int i,String n){  
    id = i;  
    name = n;  
    }  
    Testing(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    	Testing s1 = new Testing(111,"Karan");  
    	Testing s2 = new Testing(222,"Aryan",25);  
    	String s="xyzasaaadadadad".toLowerCase();
    	System.out.println(s.contains("xyz"));
    	String ss="123";
    	char c=ss.charAt(1);
    	System.out.println(c);
    	//System.out.println("2".equals(Integer.v)));
    	//s.iindexOf("xyz");
    	System.out.println(s.equalsIgnoreCase("xyz"));
    s1.display();  
    s2.display();  
   }  
}  