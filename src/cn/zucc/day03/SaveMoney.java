package cn.zucc.day03;

import java.util.Scanner;

public class SaveMoney {
	double sum=0.0 ;
	public void login(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.���2.ȡ��0.�˳�");
		System.out.println("��ѡ����Ҫ�����ҵ��");
		int num1 = sc.nextInt();
		switch (num1) {
		case 1:
			System.out.println("���������");
			double num2 = sc.nextInt();
			sum = sum + num2 ;
			System.out.println("���ɹ�");
			System.out.println("***��ǰ���Ϊ��" +sum + "Ԫ***");
			login();
			
			break;
		case 2:
			System.out.println("������ȡ���");
			double num3 = sc.nextInt();
			sum = sum - num3 ;
			System.out.println("ȡ��ɹ�");
			System.out.println("***��ǰ���Ϊ��" +sum + "Ԫ***");
			login();
			break;
		case 0:
			System.out.println("ллʹ��");
			break;

		default:
			break;
		}
		
	}

}
