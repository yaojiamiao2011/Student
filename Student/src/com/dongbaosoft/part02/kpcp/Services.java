package com.dongbaosoft.part02.kpcp;

import java.io.Console;
import java.util.Scanner;

public class Services {
	public static GoodsList goodslist =new GoodsList();
	
	public void login() {
		User user = new User();

		System.out.print("欢迎使用商品销售系统!\n请输入用户名:");
		Scanner scan = new Scanner(System.in);
		user.setUserName(scan.next());

		System.out.print("请输入密码:");
		// Console con = System.console();
		// char[] pwd = con.readPassword("%s", "请输入密码：");
		// user.setPassWord(String.valueOf(pwd));

		user.setPassWord(scan.next());

		if (user.auth() == true) {
			System.out.println("登陆成功!\n");
			showgoods();
		} else {
			System.out.println("用户名或密码错误，请重新登录!\n");
			login();
		}

	}
	
	public void logout()
	{
		System.out.println("Good Bye!");
	}
	
	/**
	 * @Description 递归判断
	 */
	public void choose() {
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("请选择操作类别（输入序号即可）!");
		System.out.println();
		System.out.println("1:添加商品到购物车\t2:修改购物车中的商品数量\t\n3:从购物车中删除商品\t4:查询购物车中的商品\t\n5:退出系统");
		System.out.println("*******************************************************");
		System.out.println();
		System.out.print("请输入：");
		Scanner scanner = new Scanner(System.in);
		String code = scanner.next();
		if ("1".equals(code) || "2".equals(code) || "3".equals(code) || "4".equals(code) || "5".equals(code)) {
			operatorType(Integer.parseInt(code));
		} else {
			System.out.println("输入错误!");
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
			System.out.println("请输入要购买的商品编号：");
			Scanner scanner = new Scanner(System.in);
			sNo = scanner.next();
			
			System.out.println("请输入购买数量：");
			try {
				scanner = new Scanner(System.in);
				iNum = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("输入错误！");
				System.out.println();
				//continue;
			}

			goodslist.p_1(sNo, iNum);
			choose();
			break;
		}
			case 5:{logout();
			break;}
			default:{System.out.println("操作錯誤。");}
		}
	}

	public void showgoods()
	{
		goodslist.showGoodsList();
		choose();
	}
}
