package cn.zucc.day02;

import java.util.Scanner;

public class shoppingMenu {
	Scanner sc = new Scanner(System.in);
	String account1 = "JadeBird";
	String password1 = "0000";
	public void login(){
		System.out.println("\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.println("**************************");
		
		System.out.println("��ѡ���������֣�");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			mainMenu();
			break;
        case 2:
			System.out.println("ллʹ��");
			break;

		default:
			break;
		}
		
	}
	public void mainMenu(){
		
		System.out.println("�������û�����");
		String acounts = sc.next();
		System.out.println("�����������룺");
		String password = sc.next();
		if(acounts.equals(account1)&&password.equals(password1)){
			System.out.println("@@��½�ɹ���JadeBird@@");
		}
		
		
	}

}
