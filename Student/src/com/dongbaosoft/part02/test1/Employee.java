package com.dongbaosoft.part02.test1;

public final class Employee extends Pepole{

	private String EmpNo;

	public String getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}
	
	public void eat()
	{
		//super.eat();
		System.out.println("�T��ʳ�óԡ�");
	}
	
	public void eat(int num)
	{
		System.out.println("�����ΰɡ�");
	}
	
	public int eat(String footname)
	{
		return 1;
	}
	
	public void work()
	{
		System.out.println("�T��Ҫ�ϰࡣ");
	}
	
	public void changeNameNew(String newName){
		changeName(newName);
	}
}
