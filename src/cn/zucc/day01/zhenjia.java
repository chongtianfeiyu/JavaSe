package cn.zucc.day01;

import java.util.Scanner;

public class zhenjia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ĵĳɼ�");
		int liScore = sc.nextInt();
		System.out.println("�����������ĳɼ�");
		int zhangScore = sc.nextInt();

		boolean isTure = zhangScore > liScore;
		System.out.println("�����ĳɼ��Ƿ�����ĸ�" + isTure);

	}

}
