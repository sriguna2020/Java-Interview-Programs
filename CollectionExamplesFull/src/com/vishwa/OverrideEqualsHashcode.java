package com.vishwa;

public class OverrideEqualsHashcode {
	private Integer id;
	private String firstname;
	private String lastName;
	private int phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println(this);
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	//@override
	public boolean equals(Object o)
	{
		/* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
		if (o == null) 
			return false;
		 // If the object is compared with itself then return true 
		if(this==o)
			return true;
		
		if (getClass() != o.getClass()) {  
			return false;  
			}  
		OverrideEqualsHashcode e=(OverrideEqualsHashcode)o;
		// Compare the data members and return accordingly 
			return (this.id==e.id);
	}
	
	/*@Override   
	public int hashCode()   
	{   
    final int PRIME = 31;   
    int result = 1;   
    result = PRIME * result + getId();   
    return result;   
    }  */
	
	public static void main(String[]args)
	{
		OverrideEqualsHashcode e1 = new OverrideEqualsHashcode();
		e1.setId(10);

		OverrideEqualsHashcode e2 = new OverrideEqualsHashcode();
		e2.setId(10);
		
		System.out.println("hashcode() is print: " +e1);
		System.out.println("hashcode() is print: " +e2);
		System.out.println("Are e1 and e2 equal: " + e1.equals(e2));
		System.out.println(10==10);

	}
	
}
