package cn.zucc.day03;

import java.util.Scanner;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 st = new Student1();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("������ѧ��������");
			st.addName(sc.next());
		}
		System.out.println("�뿪ʼ�������λ�ã�");

		int num = sc.nextInt();
		System.out.println("������������ҵ�λ�ã�");
		int num2 = sc.nextInt();
		System.out.println("��������ҵ����֣�");
		String name = sc.next();
		System.out.println("���ҽ����");
		if(st.search(num, num2, name)){
			System.out.println("�ҵ���");
		}
		else{
			System.out.println("û�ҵ�");
		}
		
		
		
	}
	
	
	}

