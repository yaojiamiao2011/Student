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
		System.out.print("�T��ʳ�óԡ�");
		super.eat();
	}
	
	public void work()
	{
		System.out.println("�T��Ҫ�ϰࡣ");
	}
}
