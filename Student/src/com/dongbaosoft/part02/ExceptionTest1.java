package com.dongbaosoft.part02;

import java.util.Scanner;

public class ExceptionTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		try
		{ 
			System.out.println("Int=");
			int x =scan.nextInt();
		}
		catch(Exception ex)
		{
			//System.out.println(ex);
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("end...");
		}
		
	}

}
