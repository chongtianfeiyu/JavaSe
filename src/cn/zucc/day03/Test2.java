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
			System.out.println("请输入学生姓名：");
			st.addName(sc.next());
		}
		System.out.println("请开始输入查找位置：");

		int num = sc.nextInt();
		System.out.println("请输入结束查找的位置：");
		int num2 = sc.nextInt();
		System.out.println("请输入查找的名字：");
		String name = sc.next();
		System.out.println("查找结果：");
		if(st.search(num, num2, name)){
			System.out.println("找到了");
		}
		else{
			System.out.println("没找到");
		}
		
		
		
	}
	
	
	}

