package com.vishwa;
class OverrideToString{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 OverrideToString(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	//overriding the toString() method  
	 
	 public String toString(){ 
	  return rollno+" "+name+" "+city;  
	  //return "vishwa";  
	 }  
	 public static void main(String args[]){  
		 OverrideToString s1=new OverrideToString(101,"Vishwa","GKP");  
		 //OverrideToString s2=new OverrideToString(102,"Amit","BSB");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   //System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  