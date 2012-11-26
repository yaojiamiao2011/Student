package com.dongbaosoft.part03.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.dongbaosoft.comm.DateClass;

public class FileClass {

	String filename = null;

	FileClass() {
		this.filename = "e:/java/tmp/a.txt";
		file = new File(filename);
	}

	FileClass(String fname) {
		this.filename = fname;
		file = new File(filename);
	}

	private File file;

	public void showfileinfo() {
		System.out.println(file.getName());
		System.out.println(file.length());

		System.out.println(DateClass.DateToString(file.lastModified()));
	}

	public void showFileMemo() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 从控制台录入字符并写入到文件中；
	 */
	public void inputStringToFile() {
		Scanner scan = new Scanner(System.in);
		String str = null;

		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file)));
			while (!"exit".equals(str = scan.next())) {
				bw.write(str+"\r\n");
				bw.flush();
			}
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
