package cn.zucc.day01;

import java.util.Scanner;

public class zhenjia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入李四的成绩");
		int liScore = sc.nextInt();
		System.out.println("请输入张三的成绩");
		int zhangScore = sc.nextInt();

		boolean isTure = zhangScore > liScore;
		System.out.println("张三的成绩是否比李四高" + isTure);

	}

}
