package com.vishwa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddUniqueInArrrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		String []str={"ram","ram","hi","hello"};
		for(int i=0;i<str.length;i++)  {
		if(!list.contains(str[i]))
		{
			list.add(str[i]);
		}
	  }	
		System.out.println(list);
		Person person = new Person();
        person.setName("Kumar");
        person.setAddress("Mumbai");
        person.setAge(25);
        //person.setAge(29);

        Person person1 = new Person();
        person1.setName("Kumar");
        person1.setAddress("Mumbai");
        person1.setAge(25);

        List<Person> persons = new ArrayList<Person>();
        
        // Before adding an object, check if it not contains
        // Adding Person Object
        if (!persons.contains(person)) {
            persons.add(person);
        }
        
        // Before adding an object, check if it not contains
        // Adding Person1 Object with same values
        if (!persons.contains(person1)) {
            persons.add(person1);
        }
        Collections.sort(persons);
        System.out.println("\nFinal List \n");
        for (Person person2 : persons) {
            System.out.println("Name - " + person2.getName());
            System.out.println("Age - " + person2.getAge());
            System.out.println("Address - " + person2.getAddress());
            
        }
      }
	}
