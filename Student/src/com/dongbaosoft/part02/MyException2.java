package com.dongbaosoft.part02;

public class MyException2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6092195693987611754L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	MyException2(){};
	MyException2(String msg){
		System.out.println("��ӡ�Զ��x������Ϣ��"+msg);
	}
}
