package com.dongbaosoft.part03.Theads;

public class MyThread2 implements Runnable {

	private String thID = null;

	MyThread2() {
	}

	public MyThread2(String id) {
		setThID(id);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while (true)
		{
			i++;
			if (i>100)
			break;
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("id="+getThID()+"; i="+i);
			
		}

	}

	public String getThID() {
		return thID;
	}

	public void setThID(String thID) {
		this.thID = thID;
	}

}
