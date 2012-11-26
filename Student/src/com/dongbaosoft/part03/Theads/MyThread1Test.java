package com.dongbaosoft.part03.Theads;

public class MyThread1Test {

	public static void main(String args[])
	{
		MyThread1 th1=new MyThread1("A");
		th1.start();
		MyThread1 th2=new MyThread1("B");
		th2.start();
	}
}
