package com.dongbaosoft.part02.test1;
/**
 * 封装相关测试
 * @author Administrator
 *
 */
public class Pepole {

	private int higth;
	private String id;
	private String Name;
	public int getHigth() {
		return higth;
	}
	public void setHigth(int higth) {
		this.higth = higth;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Pepole(){}
	public Pepole(String id){
		this.id =id;
	}
	
	protected void eat(){
		System.out.println("人吃東西。");
	}
	
	public final void changeName(String newName){
		System.out.println("改名字");
	}
}
