package com.vishwa;

public class Person implements Comparable {

    private int age;

    public String name;

    protected String address;
    @Override
    public int compareTo(Object o)
    {
    	Person p=(Person) o;
    	if(age>p.age)
    		return 1;
    	else if(age==p.age)
    		return 0;
    	else
    		return -1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString()
    {
    	return age+" "+name+" "+address;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            if (name.equals(((Person) o).name) && age == ((Person) o).age && address.equals(((Person) o).address)) {
                System.out.println("List already contains this object with Name - " + name + ", Address - " + address
                        + " & Age - " + age);
                return true;
            }
        }
        return false;
    }
}