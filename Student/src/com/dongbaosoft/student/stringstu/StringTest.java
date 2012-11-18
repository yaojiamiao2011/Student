package com.dongbaosoft.student.stringstu;

import java.util.Locale;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="DongGuang dongbaosoft.";
Locale local=new Locale(s);
String s1=s.toUpperCase(local);
System.out.println("s = "+s);
System.out.println("s1 = "+s1);
System.out.println("local = "+local);
		//s=s+' 还可以增加吗?'
	}

}
