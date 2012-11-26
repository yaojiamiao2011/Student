package com.dongbaosoft.comm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static final String DateToString(long date)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//d.toLocaleString();
		return sdf.format(new Date(date));
		
	}
}
