package com.dongbaosoft.part02;

import com.dongbaosoft.part02.test1.Pepole;

public class Employee extends Pepole{

	private String EmpNo;

	public String getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}
	
	public void eat()
	{
		System.out.print("員工食堂吃。");
		super.eat();
	}
	
	public void work()
	{
		System.out.println("員工要上班。");
	}
}
