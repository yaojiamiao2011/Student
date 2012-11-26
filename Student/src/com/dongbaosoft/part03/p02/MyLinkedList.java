package com.dongbaosoft.part03.p02;

import java.util.LinkedList;

public class MyLinkedList extends Basic {
	LinkedList kl = new LinkedList();

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		kl.add("x");
		kl.add(0);
		kl.add(false);
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(kl);
	}

}
