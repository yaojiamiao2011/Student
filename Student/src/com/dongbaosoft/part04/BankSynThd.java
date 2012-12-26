package com.dongbaosoft.part04;

public class BankSynThd extends Thread {

	private Bank bank;

	BankSynThd() {
	}

	BankSynThd(Bank b) {
		this.bank = b;
	}

	public void run() {
		while (true) {
			bank.moneyprocess();
		}
	}

}
