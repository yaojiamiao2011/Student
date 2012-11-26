package com.dongbaosoft.part03;

public class Test1 {

	public void work(People t) {
		t.study();
		t.work();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		People perple1 = new People1();
		t.work(perple1);
		People perple2 = new People2();
		t.work(perple2);
	}

}
