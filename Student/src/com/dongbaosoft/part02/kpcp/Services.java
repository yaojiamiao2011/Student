package com.dongbaosoft.part02.kpcp;

import java.io.Console;
import java.util.Scanner;

public class Services {
	public static GoodsList goodslist =new GoodsList();
	
	public void login() {
		User user = new User();

		System.out.print("��ӭʹ����Ʒ����ϵͳ!\n�������û���:");
		Scanner scan = new Scanner(System.in);
		user.setUserName(scan.next());

		System.out.print("����������:");
		// Console con = System.console();
		// char[] pwd = con.readPassword("%s", "���������룺");
		// user.setPassWord(String.valueOf(pwd));

		user.setPassWord(scan.next());

		if (user.auth() == true) {
			System.out.println("��½�ɹ�!\n");
			showgoods();
		} else {
			System.out.println("�û�����������������µ�¼!\n");
			login();
		}

	}
	
	public void logout()
	{
		System.out.println("Good Bye!");
	}
	
	/**
	 * @Description �ݹ��ж�
	 */
	public void choose() {
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("��ѡ��������������ż��ɣ�!");
		System.out.println();
		System.out.println("1:�����Ʒ�����ﳵ\t2:�޸Ĺ��ﳵ�е���Ʒ����\t\n3:�ӹ��ﳵ��ɾ����Ʒ\t4:��ѯ���ﳵ�е���Ʒ\t\n5:�˳�ϵͳ");
		System.out.println("*******************************************************");
		System.out.println();
		System.out.print("�����룺");
		Scanner scanner = new Scanner(System.in);
		String code = scanner.next();
		if ("1".equals(code) || "2".equals(code) || "3".equals(code) || "4".equals(code) || "5".equals(code)) {
			operatorType(Integer.parseInt(code));
		} else {
			System.out.println("�������!");
			System.out.println();
			choose();
		}
	}
	private void operatorType(int parseInt) {
		// TODO Auto-generated method stub
		String sNo;
		int iNum = 0;
		switch (parseInt){
		case 1:{
			System.out.println("������Ҫ�������Ʒ��ţ�");
			Scanner scanner = new Scanner(System.in);
			sNo = scanner.next();
			
			System.out.println("�����빺��������");
			try {
				scanner = new Scanner(System.in);
				iNum = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("�������");
				System.out.println();
				//continue;
			}

			goodslist.p_1(sNo, iNum);
			choose();
			break;
		}
			case 5:{logout();
			break;}
			default:{System.out.println("�����e�`��");}
		}
	}

	public void showgoods()
	{
		goodslist.showGoodsList();
		choose();
	}
}
