package com.dongbaosoft.part03;

public class Test2 {
	People people;

	public void working() {
		people.work();
	}

	Test2() {
	}

	Test2(People p) {
		this.people = p;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People2();
		Test2 t =new Test2(p1);
		t.working();

	}

}
