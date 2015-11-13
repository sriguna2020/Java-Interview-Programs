package com.vishwa;

 class Company {
	// public static method which can not be overridden in Java
		public static void staticMethod() {
			System.out.println("Super class: Static  method");
		}
	 
		// non static method
		public void nonStaticMethod() {
			System.out.println("Company: non-Static method");
		}
	
}
public class MethodHidingAndOverriding extends Company {
	/*
	 * static method of same name and method signature as existed in super
	 * class, this is not method overriding instead this is called method hiding
	 * in Java
	 */
	public static void staticMethod() {
		System.out.println("subclass :  Static  method");
	}
	// non static method
	public void nonStaticMethod() {
		System.out.println("MethodHidingAndOverriding: non-Static method");
	}
	public static void main(String[] args) {
		
		Company cmp = new MethodHidingAndOverriding();
		// if we can override static, this should call method from Child class
		cmp.staticMethod(); // Eclipse should show warning: The static method
							// staticMethod() from the type Company should be
							// accessed in a static way
		// here this is called method hiding
		cmp.nonStaticMethod();// here method overriding
		
		

	}

}
