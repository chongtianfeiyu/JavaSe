package cn.zucc.day04;

import java.util.Scanner;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User user = new User();
		UserDaoImpl ud = new UserDaoImpl();
		ud.show();
		System.out.println();
		System.out.println("�������û�����");
		user.name = sc.next();
		System.out.println("���������룺");
		user.pd = sc.next();
		System.out.println("�������Ա�");
		user.gender = sc.next();
		ud.addU(user);
		ud.show();
		
		
		

	}

}
