package cn.zucc.day03;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		for(int i=0 ;i<5;i++){
		System.out.println("请输入学生姓名：");
		st.addName(sc.next());
		
		
		}
		st.showName();
		System.out.println("请输入要修改的学生姓名：");
		String name = sc.next();
		System.out.println("请输入新的学生姓名：");
		String name1= sc.next();
	    st.search(name, name1);
		st.showName();

	}
	
	

}
