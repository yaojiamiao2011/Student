package com.dongbaosoft.part03.p02;

import java.util.ArrayList;
import java.util.Iterator;

public class MyListT<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyListT<Employee> t = new MyListT<Employee>();

		Employee e = new Employee(88,"yaojiamiao");
		t.add(e);
		t.show();
		System.out.println(((Employee)t.list.get(0)).getEmpName());
		
	}

	public ArrayList<T> list = new ArrayList<T>();

	public void add(T e) {
		list.add(e);
	}

	public void show() {
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println(list);
	}

}
