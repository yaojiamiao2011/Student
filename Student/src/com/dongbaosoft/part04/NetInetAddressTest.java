package com.dongbaosoft.part04;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public class NetInetAddressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		System.out.println( InetAddress.getLocalHost().getHostAddress());
		System.out.println(InetAddress.getLocalHost().getHostName());
		System.out.println(InetAddress.getLocalHost().getAddress());
		InetAddress[] l = InetAddress.getAllByName(null);
		System.out.println(l.length);
		for(InetAddress tmp:l)
		{
			System.out.println(tmp.getHostAddress());
		}
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
