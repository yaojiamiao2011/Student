package com.dongbaosoft.part02;

import java.util.Scanner;

public class ExceptionTest3 {

	/**
	 * @param args
	 * @throws MyException1 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ExceptionTest3 t =new ExceptionTest3();
//		try {
//			t.f1();
//		} catch (MyException1 e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			t.f2();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void f1() throws MyException1{
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
		} catch (Exception ex) {
			//ex.printStackTrace();
			System.out.println("在這里調用自定義異常");
			throw new MyException1();
		} finally {
			System.out.println("END....");
		}

	}
	
	public void f2() throws MyException2{
		
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
		} catch (Exception ex) {
			//ex.printStackTrace();
			System.out.println("在這里調用自定義異常");
			throw new MyException2("錄入 值不對！！");
		} finally {
			System.out.println("END....");
		}
	}

}
