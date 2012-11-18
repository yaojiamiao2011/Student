package com.dongbaosoft.part02;

import java.util.Scanner;

public class ExceptionTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest2 t =new ExceptionTest2();
		t.testInput();
	}
	
	public void testInput()
	{
		Scanner scan = new Scanner(System.in);
		
		try
		{ 
			System.out.println("Int=");
			int x =scan.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
			testInput();
			//ex.printStackTrace();
		}
		finally
		{
			System.out.println("end...");
		}
		
	}

}
