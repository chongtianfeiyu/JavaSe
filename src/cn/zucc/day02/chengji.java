package cn.zucc.day02;

import java.util.Scanner;

public class chengji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ĳɼ�");
		int score = sc.nextInt();
		if(score>=80){
			System.out.println("���ĳɼ�Ϊ����");
		}
		else if (score>=60){
			System.out.println("���ĳɼ�Ϊ�е�");
			
		} 
		else{
			System.out.println("���ĳɼ�Ϊ��");
		}
	}

}
