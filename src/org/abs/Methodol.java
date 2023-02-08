package org.abs;

 class Methodol {
	private void detail() {
		System.out.println("the detailsabout parent");

	}
	private void detail(int no) {
		System.out.println("my id no si" +no);

	}
	public static void main(String[] args) {
		Methodol m=new Methodol();
		m.detail();
		m.detail(11);
	}

}
