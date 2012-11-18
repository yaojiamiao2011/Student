package com.dongbaosoft.part02.kpcp;

public class GoodsList {
	public static Goods goods[] = new Goods[105];

	GoodsList() {
		for (int i = 0; i < 5; i++) {
			goods[i] = new Goods("G00" + (i + 1), "商品" + (i + 1), (i + 1) * 100);
		}
	};

	GoodsList(int arrNum) {
		for (int i = 0; i < arrNum; i++) {
			goods[i] = new Goods("G00" + (i + 1), "商品" + (i + 1), (i + 1) * 100);
		}
	};

	public void showGoodsList() {
		System.out.println();
		System.out
				.println("*******************************************************");
		System.out.println("欢迎使用商品销售系统!祝您购物愉快!以下是商品列表：");
		System.out.println("***********************************************");
		System.out.println("商品编号" + "\t" + "商品名称" + "\t\t" + "商品库存");
		System.out.println("***********************************************");
		for (Goods tmpGoods : goods) {
			if (tmpGoods != null)
				tmpGoods.showGoods();
		}
	}

	public int f_getIndex(String sNo) {
		int index = -1;
		for (int i = 0; i < goods.length; i++) {
			if (goods[i] != null) {
				if (sNo.equals(goods[i].getGoodsNo()))
					index = i;
			}
		}
		return index;

	}

	public void p_1(String sNo, int iNum) {
		int index = f_getIndex(sNo);
		if (index > -1) {
			goods[index].p_1(iNum);
			showGoodsList();
		} else {
			System.out.println("未找到編號=" + sNo + "的商品。");
		}
	}

}
