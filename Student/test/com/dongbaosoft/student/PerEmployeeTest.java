package com.dongbaosoft.student;

import org.junit.Test;

public class PerEmployeeTest {

	@Test
	public void testSetEmpNo() {
		//fail("Not yet implemented");
		PerEmployee perEmployee2 = new PerEmployee("2012001","yaojiamiao");
		
		PerDepart perDepart1 = new PerDepart();
		perEmployee2.setDepart(perDepart1);
		
		perEmployee2.getDepart().setDtID("A01");
		perEmployee2.getDepart().setDtName("生产部");
		
		perEmployee2.printvalue();
		
		
		PerEmployee perEmployee1 = new PerEmployee();
		perEmployee1.setEmpNo("2012001");
		perEmployee1.setEmpName("yaojiamiao");
		
		PerDepart perDepart2 = new PerDepart();
		perEmployee1.setDepart(perDepart2);
		perEmployee1.getDepart().setDtID("A01");
		perEmployee1.getDepart().setDtName("生产部");
		perEmployee1.setMKFactory("abc");
		
		perEmployee1.printvalue();
		perEmployee2.printvalue();
		
		
	}

}
