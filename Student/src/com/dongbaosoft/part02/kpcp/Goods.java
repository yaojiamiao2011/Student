package com.dongbaosoft.part02.kpcp;

public class Goods {

	private String goodsNo;
	private String goodsName;
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
		
	Goods(){};
	Goods(String sno,String sName, int iNum){
		setGoodsNo(sno);
		setGoodsName(sName);
		setNum(iNum);
	}
	public void showGoods()
	{
		System.out.println(getGoodsNo() + "\t" + getGoodsName() + "\t\t" + getNum());
	}
	public void p_1(int iNum) {
		// TODO Auto-generated method stub
		setNum(getNum()-iNum);
	}
}
