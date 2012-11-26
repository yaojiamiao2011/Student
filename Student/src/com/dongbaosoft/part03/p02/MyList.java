package com.dongbaosoft.part03.p02;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList extends Basic{

	ArrayList al=new ArrayList(10);
	public void addData(){
		al.add(0);
		al.add(88);
		al.add(true);
		al.add("yao");
		al.add(85);
		al.add(88);
		al.add("jiamiao");
	}
	public void showData()
	{
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}
}
