package cn.zucc.day02;

import java.util.Scanner;

public class chengji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("输入你的成绩");
		int score = sc.nextInt();
		if(score>=80){
			System.out.println("您的成绩为良好");
		}
		else if (score>=60){
			System.out.println("您的成绩为中等");
			
		} 
		else{
			System.out.println("您的成绩为差");
		}
	}

}
