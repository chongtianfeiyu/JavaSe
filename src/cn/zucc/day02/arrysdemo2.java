package cn.zucc.day02;

import java.util.Scanner;

public class arrysdemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入会员本月的消费记录");
	
		Scanner sc = new Scanner(System.in);
		double[] money = new double[5];
		for(int i=0;i<money.length;i++){
			int q =i +1 ;
		System.out.println("请输入第"+ q +"笔购物金额");
		double money1 = sc.nextDouble();
		money[i]=money1;
		}
		
		
		System.out.println("序号\t\t\t金额(元)");
		for(int i=0;i<money.length; i++){
			int q = i+1;
			System.out.println(q+"\t\t\t"+money[i]);
		}
	}

}
