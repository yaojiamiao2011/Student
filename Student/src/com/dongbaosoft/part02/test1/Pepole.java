package com.dongbaosoft.part02.test1;
/**
 * ��װ��ز���
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
		System.out.println("�˳Ԗ|����");
	}
	
	public final void changeName(String newName){
		System.out.println("������");
	}
}
