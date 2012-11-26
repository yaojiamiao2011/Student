package com.dongbaosoft.part03.p02;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashMap extends Basic {
	HashMap<String, Employee> hm = new HashMap<String, Employee>();

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "yjm");
		Employee e2 = new Employee(2, "zhang3");
		Employee e3 = new Employee(3, "li4");
		hm.put(Integer.toString(e1.getEmpNo()), e1);
		hm.put(Integer.toString(e2.getEmpNo()), e2);
		hm.put(Integer.toString(e3.getEmpNo()), e3);
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(hm);
		Iterator it=hm.keySet().iterator();
		while (it.hasNext())
		{
			System.out.println(hm.get(it.next()));
		}
	}

}
