package org.abs;

public class Singleton {
	public static Singleton s;
	
	private Singleton() {

}
	public static Singleton createObject() {
		if(s==null) {
			 s=new Singleton();
		}
	return s;
	}	
		public void id() {
			System.out.println("the id no is 1234");
		}
		
		public void name() {
			System.out.println("the nameis kavin");
		}
		public static void main(String[] args) {
			Singleton s=createObject(); 
			System.out.println(System.identityHashCode(s));
			s.id();
			s.name();
			Singleton s2=createObject();
			System.out.println(System.identityHashCode(s2));
			s2.id();
			s2.name();
			
			
			
			
		}
		
		
	}
	

