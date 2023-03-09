package org.cheack;

public class Labour extends Company{

	public Labour() {
		this(56750.89f);// it will call current class constructor
	System.out.println("labour");
	}
	public Labour(String address) {
		super();//it will call parent class constructor
		System.out.println("labour address is "+address);
	}
	public Labour(float salary) {
		this("omr chennai");
		System.out.println("labour salary is "+salary);
		}
	
	public static void main(String[]args) {
		
		new Labour();
	}
}
//constructor chaining- To reduce the number of object creation
//it have 2 keywords
///1.this- to call current class constructor
//2.to call parent class contructor

//note:
// we cannot call same constructor while using "this keyword"

//difference between normal method & constructor????
// ans: in normal method we need to call the method by using object creation
//      but in constructor if we create object it automatically once called
//     -the constructor.