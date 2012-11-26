package com.dongbaosoft.part03.p02;

import java.util.HashSet;

public class MyHashSet extends Basic {

	HashSet hs = new HashSet(10);

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		hs.add("x");
		hs.add(false);
		hs.add(33);
		hs.add("yao");
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(hs);
	}

}
