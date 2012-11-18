package com.dongbaosoft.student;

import java.util.Date;

public class PerEmployee {
	public static final String PRONAME="hr system";
	
	public static String MKFactory;
	
	public static String getMKFactory() {
		return MKFactory;
	}

	public static void setMKFactory(String mKFactory) {
		MKFactory = mKFactory;
	}

	String EmpNo;
	private String EmpName;
	private Date ComeDate;
	private PerDepart depart;

	
	public PerEmployee(String EmpNo, String EmpName) {
		// TODO Auto-generated constructor stub
		this.EmpNo =EmpNo;
		this.EmpName =EmpName;
		setMKFactory("ÆäËü");
	}

	
	public PerEmployee() {
		// TODO Auto-generated constructor stub
		setMKFactory("¶«±¦");
	}


	public String getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Date getComeDate() {
		return ComeDate;
	}

	public void setComeDate(Date comeDate) {
		ComeDate = comeDate;
	}

	public PerDepart getDepart() {
		return depart;
	}

	public void setDepart(PerDepart depart) {
		this.depart = depart;
	}
	
	public void printvalue()
	{
		System.out.println("PRONAME = "+this.PRONAME);
		System.out.println(this);
		System.out.println(this.MKFactory);
		System.out.println(this.getEmpNo());
		System.out.println(this.getDepart().getDtName());
		System.out.println("-----------------------");
	}

}
