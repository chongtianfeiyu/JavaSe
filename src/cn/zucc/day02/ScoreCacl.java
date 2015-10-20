package cn.zucc.day02;

import java.util.Scanner;

public class ScoreCacl {
	Scanner sc = new Scanner(System.in) ;
	public void cal(){
		System.out.println("请输入JAVA成绩：");
		int javaScore = sc.nextInt();
		System.out.println("请输入C#成绩：");
		int c = sc.nextInt();
		System.out.println("请输入DB成绩：");
		int DB = sc.nextInt();
		int sum ;
		sum = javaScore + c + DB ;
		System.out.println("总成绩是："+sum);
		int ave ;
		ave = sum/3 ;
		System.out.println("平均分是："+ave);
	}

}
