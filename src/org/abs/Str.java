package org.abs;

public class Str {
	public static void main(String[] args) {
		
	
	String s="ranuga";
	System.out.println(s.length());
	char charAt = s.charAt(5);
	System.out.println(charAt);
	int in = s.indexOf('a');
	System.out.println(in);
	System.out.println(s.lastIndexOf('a'));
	for(int i=0;i<=s.length();i++)
		System.out.println(s.substring(0,i));
	for(int i=6;i>=0;i--)
	{
		System.out.println(s.substring(0,i));
	}
		
	}

	
	
	}



