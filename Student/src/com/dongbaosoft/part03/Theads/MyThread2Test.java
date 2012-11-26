package com.dongbaosoft.part03.Theads;

public class MyThread2Test {

	public static void main(String args[]){
		
		Thread th1 =new Thread(new MyThread2("AA"));
		th1.start();
		Thread th2 =new Thread(new MyThread2("BB"));
		th2.start();
	}
}
