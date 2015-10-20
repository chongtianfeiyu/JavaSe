package cn.zucc.day02;

import java.util.Scanner;

public class buke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ; 
		System.out.println("请输入消费金额");
		int money = sc.nextInt() ;
		System.out.println("是否参加换购活动：");
		System.out.println("1：满50，加2元换购百事可乐饮料一瓶");
		System.out.println("2：满100，加3元换购500ml可乐一瓶");
		System.out.println("3：满100，加10元换购5公斤面粉");
		System.out.println("4：满200，加10元换购1个苏泊尔炒菜锅");
		System.out.println("5：满200，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0:不换购");
		System.out.println("请选择：");
		int shuzi = sc.nextInt();
		int money1 ;
		switch (shuzi) {
		case 1:
			if(money>=50){
			money1 = money + 2 ;
			System.out.println("本次消费总金额：" + money1);
			System.out.println("成功换购：百事可乐饮料");
			}
			else{
				System.out.println("换购不成功");
			}
			break;

		case 2 :
			if(money>=100){
			money1 = money + 3 ;
			System.out.println("本次消费总金额：" + money1);
			System.out.println("成功换购：500ml可乐");
			}
			else{
				System.out.println("换购不成功");
			}
			break;
		case 3 :
			if(money>=100){
				money1 = money + 10 ;
				System.out.println("本次消费总金额：" + money1);
				System.out.println("成功换购：5公斤面粉");
				}
				else{
					System.out.println("换购不成功");
				}
			break ;
		case 4 :
			if(money>=200){
				money1 = money + 10 ;
				System.out.println("本次消费总金额：" + money1);
				System.out.println("成功换购：苏泊尔炒菜锅");
				}
				else{
					System.out.println("换购不成功");
				}
			break ;
		case 5 :
			if(money>=100){
				money1 = money + 20 ;
				System.out.println("本次消费总金额：" + money1);
				System.out.println("成功换购：珀莱雅爽肤水");
				}
				else{
					System.out.println("换购不成功");
				}
			break ;
			
		default:
			break;
		}
	}

}
