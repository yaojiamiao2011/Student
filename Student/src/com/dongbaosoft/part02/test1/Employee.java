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
		System.out.println("員工食堂吃。");
	}
	
	public void eat(int num)
	{
		System.out.println("吃三次吧。");
	}
	
	public int eat(String footname)
	{
		return 1;
	}
	
	public void work()
	{
		System.out.println("員工要上班。");
	}
	
	public void changeNameNew(String newName){
		changeName(newName);
	}
}
