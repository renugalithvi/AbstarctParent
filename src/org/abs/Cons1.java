package org.abs;

public class Cons1 {
	public Cons1() {
		int i=1,j=3;
		
		int s=i+j;
		System.out.println("this is default constructor"  +s);
		
	}
	public Cons1(int id) {
		this();
		
		System.out.println("the given id no is "+id);
	}

}
