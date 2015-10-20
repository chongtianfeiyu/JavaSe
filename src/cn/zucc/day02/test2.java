package cn.zucc.day02;

import java.util.Scanner;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		point pt = new point();
		System.out.print("积分：");
		pt.howPoint = sc.nextInt();
		System.out.print("卡类型：");
		pt.cardType = sc.next();
		if(pt.cardType.equals("金卡")&&pt.howPoint>1000){
		System.out.println("回馈积分500");	
		}
		else if(pt.cardType.equals("普卡")&&pt.howPoint>5000){
			System.out.println("回馈积分500");	
		}
		*/
		shoppingMenu sm = new shoppingMenu();
		sm.login();
		
	}

}
