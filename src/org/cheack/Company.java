
                  //CONSTRUCTOR//
package org.cheack;

public class Company {

	public Company() {// non-parameterized constructor or default constructor
		this(12345678901L);
		System.out.println("company");
	}
	public Company(String name) {//parameterized constructor or argument based constructor
		System.out.println("company name is "+name);
	}
	public Company(long phno) {
		this("greens");
		System.out.println("company phno is  "+phno);
	}
	
	public static void main(String[]args) {
		
		new Company();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
