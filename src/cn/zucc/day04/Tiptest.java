package cn.zucc.day04;

import java.util.Scanner;

public class Tiptest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Topic tp = new Topic();
	
		System.out.println("���ӱ��⣺" + tp.getTitle());
		System.out.println("�������ӱ��⣺");
		tp.setTitle(sc.next());
		System.out.println("���ӱ��⣺" + tp.getTitle());


	}

}
