package com.dongbaosoft.part04;

public class Bank {

	public int money = 5000;

	// @Override
	public synchronized void moneyprocess() {
		// public void moneyprocess() {
		// TODO Auto-generated method stub
		// super.run();

		try {
			{
				if (Thread.currentThread().getName().equals("acc1")) {
					if (money < 20000) {
						for (int i = 0; i < 5; i++) {
							money += 1000;
							System.out.println("++++Add money,i=" + i
									+ ";money=" + money);
							Thread.sleep(500);
						}
					}
					else
					{wait();
					System.out.println("Í£Ö¹´æÇ®¡£");}
				} else if (Thread.currentThread().getName().equals("acc2")) {
					if (money>500)
					{
					for (int i = 0; i < 5; i++) {
						money -= 500;
						System.out.println("----Del money,i=" + i + ";money="
								+ money);
						Thread.sleep(500);
					}}
					else
					{wait();System.out.println("Í£Ö¹È¡Ç®¡£*********");}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
	}

}
