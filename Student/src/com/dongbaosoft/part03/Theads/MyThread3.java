package com.dongbaosoft.part03.Theads;

public class MyThread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread th = new Thread(new MyThread2("AAA"));
		int i = 0;
		while (true) {
			i++;
			if (i == 10) {

				th.start();
				if (th.isAlive())
					try {
						th.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("主进程，i=" + i);

		}
	}

}
