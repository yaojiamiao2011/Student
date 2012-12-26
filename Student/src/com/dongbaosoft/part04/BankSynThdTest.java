package com.dongbaosoft.part04;

public class BankSynThdTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		BankSynThd t1=new BankSynThd(bank);
		BankSynThd t2=new BankSynThd(bank);
		t1.setName("acc1");
		t2.setName("acc2");
		t1.start();
		t2.start();

	}

}
