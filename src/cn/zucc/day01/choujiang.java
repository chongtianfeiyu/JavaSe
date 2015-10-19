package cn.zucc.day01;

import java.util.Scanner;

public class choujiang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("学号各位上数字之和等于20的本期幸运学生");
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入学员的四位学号");
		int xuehao = sc.nextInt();
		int sum ;
		sum = (xuehao/1000 + (xuehao/100)%10 + (xuehao/10)%10 + xuehao%10 ) ;
		
		System.out.println("你的学号上个四位数字之和是："+sum );
		boolean isTure;
		isTure = sum ==20;
		
		System.out.println("你是幸运学生："+isTure);
		
		
		
		
	}

}
