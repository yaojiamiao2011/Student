package com.dongbaosoft.part02;

import com.dongbaosoft.part02.test1.Pepole;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pepole pepole1 = new Pepole("432506****11");
		System.out.println("���֤���ǣ�" + pepole1.getId());
		
		Employee employee=new Employee();
		employee.eat();
		
		Pepole pepole2=new Employee();
		System.out.println("���֤���ǣ�" + pepole2.getId());
		//pepole2.eat();  �o���L����
		
		((Employee)pepole2).work();
		
	}

}
