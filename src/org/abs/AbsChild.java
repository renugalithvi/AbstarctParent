package org.abs;

public class AbsChild extends AbsPar{
	@Override
	protected void savings() {
		System.out.println(1);
		
	}
	//@Override
	public void deposit() {
		
		super.deposit();
	}
	public static void main(String[] args) {
		AbsChild a=new AbsChild();
		a.deposit();
		a.savings();
		
	}

	

	

}
