package cn.zucc.day03;

import java.util.Scanner;

public class SaveMoney {
	double sum=0.0 ;
	public void login(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.存款2.取款0.退出");
		System.out.println("请选择你要办理的业务：");
		int num1 = sc.nextInt();
		switch (num1) {
		case 1:
			System.out.println("请输入存款金额：");
			double num2 = sc.nextInt();
			sum = sum + num2 ;
			System.out.println("存款成功");
			System.out.println("***当前余额为：" +sum + "元***");
			login();
			
			break;
		case 2:
			System.out.println("请输入取款金额：");
			double num3 = sc.nextInt();
			sum = sum - num3 ;
			System.out.println("取款成功");
			System.out.println("***当前余额为：" +sum + "元***");
			login();
			break;
		case 0:
			System.out.println("谢谢使用");
			break;

		default:
			break;
		}
		
	}

}
