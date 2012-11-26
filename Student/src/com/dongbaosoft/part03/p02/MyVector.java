package com.dongbaosoft.part03.p02;

import java.util.Vector;

public class MyVector extends Basic {
	Vector vc = new Vector();

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		vc.addElement("yao");
		vc.add(1);
		vc.addElement(false);
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(vc);
	}

}
