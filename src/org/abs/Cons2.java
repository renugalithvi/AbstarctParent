package org.abs;

public class Cons2 {
	public static void main(String[] args) {
		String a="renu 1990";
		a=a+"Welcome";
		System.out.println(a);
		int q = System.identityHashCode(a);
		System.out.println(q);
		String[] split = a.split(" ");
		System.out.println(split);
	}

}
