package cn.zucc.day03;

import java.util.Scanner;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student22 sd = new Student22();
		String flag ;
		do {
			Student2 sd1 = new Student2();
			System.out.println("������ߣ�");
			double num = sc.nextDouble();
			sd1.height=num;
			sd.addSt(sd1);
			System.out.println("�Ƿ��������(y/n?)");
			flag = sc.next();
		} while (flag.equals("y"));
		
		
		double avg =sd.average();
		System.out.println("ƽ�������"+avg);
	}

}
