package cn.zucc.day02;

import java.util.Scanner;

public class shoppingMenu {
	Scanner sc = new Scanner(System.in);
	String account1 = "JadeBird";
	String password1 = "0000";
	public void login(){
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println("**************************");
		
		System.out.println("请选择输入数字：");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			mainMenu();
			break;
        case 2:
			System.out.println("谢谢使用");
			break;

		default:
			break;
		}
		
	}
	public void mainMenu(){
		
		System.out.println("请输入用户名：");
		String acounts = sc.next();
		System.out.println("请输入用密码：");
		String password = sc.next();
		if(acounts.equals(account1)&&password.equals(password1)){
			System.out.println("@@登陆成功；JadeBird@@");
		}
		
		
	}

}
