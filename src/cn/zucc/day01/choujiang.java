package cn.zucc.day01;

import java.util.Scanner;

public class choujiang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ѧ�Ÿ�λ������֮�͵���20�ı�������ѧ��");
		Scanner sc =new Scanner(System.in);
		System.out.println("������ѧԱ����λѧ��");
		int xuehao = sc.nextInt();
		int sum ;
		sum = (xuehao/1000 + (xuehao/100)%10 + (xuehao/10)%10 + xuehao%10 ) ;
		
		System.out.println("���ѧ���ϸ���λ����֮���ǣ�"+sum );
		boolean isTure;
		isTure = sum ==20;
		
		System.out.println("��������ѧ����"+isTure);
		
		
		
		
	}

}
