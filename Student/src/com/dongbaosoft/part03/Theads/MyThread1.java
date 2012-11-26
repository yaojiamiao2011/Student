package com.dongbaosoft.part03.Theads;

public class MyThread1 extends Thread {
	private String thID = null;

	MyThread1() {
	}

	public MyThread1(String id) {
		this.setThID(id);

	}

	public void run() {
		int i = 0;
		while (true) {
			if (i > 100)
				break;
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("id="+getThID()+"; i=" + i);
			i++;
		}
	}

	public String getThID() {
		return thID;
	}

	public void setThID(String thID) {
		this.thID = thID;
	}
}
