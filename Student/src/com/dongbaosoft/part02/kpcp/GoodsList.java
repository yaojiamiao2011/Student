package com.dongbaosoft.part02.kpcp;

public class GoodsList {
	public static Goods goods[] = new Goods[105];

	GoodsList() {
		for (int i = 0; i < 5; i++) {
			goods[i] = new Goods("G00" + (i + 1), "��Ʒ" + (i + 1), (i + 1) * 100);
		}
	};

	GoodsList(int arrNum) {
		for (int i = 0; i < arrNum; i++) {
			goods[i] = new Goods("G00" + (i + 1), "��Ʒ" + (i + 1), (i + 1) * 100);
		}
	};

	public void showGoodsList() {
		System.out.println();
		System.out
				.println("*******************************************************");
		System.out.println("��ӭʹ����Ʒ����ϵͳ!ף���������!��������Ʒ�б�");
		System.out.println("***********************************************");
		System.out.println("��Ʒ���" + "\t" + "��Ʒ����" + "\t\t" + "��Ʒ���");
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
			System.out.println("δ�ҵ���̖=" + sNo + "����Ʒ��");
		}
	}

}
