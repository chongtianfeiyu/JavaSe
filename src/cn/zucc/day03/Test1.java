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
		System.out.println("������ѧ��������");
		st.addName(sc.next());
		
		
		}
		st.showName();
		System.out.println("������Ҫ�޸ĵ�ѧ��������");
		String name = sc.next();
		System.out.println("�������µ�ѧ��������");
		String name1= sc.next();
	    st.search(name, name1);
		st.showName();

	}
	
	

}
