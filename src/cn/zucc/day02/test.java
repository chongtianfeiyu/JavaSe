package cn.zucc.day02;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		Administrator ad = new Administrator() ;
		System.out.println("请输入名字：");
		ad.name = sc.next();
		ad.show();
	*/	
		/*Scanner sc = new Scanner(System.in);
		Customer ct = new Customer();
		System.out.println("请输入卡类型：");
		ct.cardType = sc.next();
		System.out.println("请输入积分");
		ct.point = sc.nextInt();
		ct.show();
		*/
		Scanner sc = new Scanner(System.in);
		Manager mg = new Manager();
		System.out.println("请输入用户名：");
		mg.accounts = sc.next();
		System.out.println("请输入密码：");
		mg.passwords = sc.next();
		String acounts1 ="admins" ;
		String password1 ="111111" ;
		if((mg.accounts.equals(acounts1))&&mg.passwords.equals(password1)){
			System.out.println("登陆成功");
		}
		else{
			System.out.println("您的账号密码有误");
			
		}
		int flag = 0 ;
		while(flag==0){
			System.out.println("请输入新密码：");
			int password3 = sc.nextInt();
			System.out.println("请再次输入新密码");
			int password2 = sc.nextInt();
			if(password3==password2){
				flag = 1;
				System.out.println("修改密码成功您的密码为："+password3 );
			}
			else{
				flag = 0;
				System.out.println("您两次输入的密码不一致，请重新输入");
			}
			
		}
		
	}

}
