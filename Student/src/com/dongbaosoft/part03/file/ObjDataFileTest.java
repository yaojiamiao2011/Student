package com.dongbaosoft.part03.file;

import com.dongbaosoft.part03.p02.Employee;

public class ObjDataFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjDataFile t=new ObjDataFile("E:/JAVA/tmp/object.dat");
		//t.writData();
		t.writData(new Employee(2500,"ZHANGEÈý"));
		t.readData();
	}

}
