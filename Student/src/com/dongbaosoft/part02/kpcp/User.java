package com.dongbaosoft.part02.kpcp;

public class User {
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public boolean auth()
	{
		System.out.println("userName="+userName);
		System.out.println("passWord="+passWord);
		if (userName!=null && passWord!=null && "kpcp".equals(userName) && "kpcp".equals(passWord))
		{
			return true;
		}
		else
			return false;
	}
}
