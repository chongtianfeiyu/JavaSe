package cn.zucc.day02;

import java.util.Scanner;

public class arrysdemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������Ա���µ����Ѽ�¼");
	
		Scanner sc = new Scanner(System.in);
		double[] money = new double[5];
		for(int i=0;i<money.length;i++){
			int q =i +1 ;
		System.out.println("�������"+ q +"�ʹ�����");
		double money1 = sc.nextDouble();
		money[i]=money1;
		}
		
		
		System.out.println("���\t\t\t���(Ԫ)");
		for(int i=0;i<money.length; i++){
			int q = i+1;
			System.out.println(q+"\t\t\t"+money[i]);
		}
	}

}
