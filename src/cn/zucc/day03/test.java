package cn.zucc.day03;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SaveMoney sm = new SaveMoney(); sm.login();
		 */

		Scanner sc = new Scanner(System.in);
		CustomerText ct = new CustomerText();
		int index = 0;
		String flag;
		do {
			System.out.println("请输入客户姓名");
			String name = sc.next();
			System.out.println("是否继续输入(y/n?)");
			flag = sc.next();

			ct.addName(name);
		} while (flag.equals("y"));
		ct.showName();
		System.out.println("请输入要查找的客户姓名：");
		String name1 = sc.next();

		if (ct.search(name1)) {
			System.out.println("查找结果：");
			System.out.println("找到了！");
		} 
		else {
			System.out.println("没找到");
		}
	}

}
