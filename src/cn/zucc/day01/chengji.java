package cn.zucc.day01;

import java.util.Scanner;

public class chengji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("张三Java课程的成绩是：");
int javaScore = sc.nextInt() ; 
System.out.println("张三Sql课程的成绩是：");
int sqlScore = sc.nextInt() ; 
System.out.println("张三最后门课程的成绩是：");
int lastScore = sc.nextInt() ;
double average = (javaScore + sqlScore + lastScore )/3 ;
System.out.println("三门课程的平均分是：" + average);
double cha = javaScore - sqlScore ;
System.out.println("java课程和sql课程之差是：" + cha);	
		
		
		
		
		
		
	}

}
