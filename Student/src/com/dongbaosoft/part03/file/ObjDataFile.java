package com.dongbaosoft.part03.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.dongbaosoft.part03.p02.Employee;

public class ObjDataFile {

	private File file;

	ObjDataFile() {
		this.file = new File("e:/java/tmp/a.txt");
	}

	ObjDataFile(String fname) {
		this.file = new File(fname);
	}

	public void writData() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeInt(12345);
			oos.writeObject("Today");
			oos.writeObject(new Date());

			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("写入完成。");
	}

	public void writData(Employee emp) {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(file));

			oos.writeObject(emp);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("写入完成。");
	}

	public Employee readData() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					file));
			Employee emp = (Employee) ois.readObject();
			System.out.println("empno=" + emp.getEmpNo());
			System.out.println("empname=" + emp.getEmpName());

			ois.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
