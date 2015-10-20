package cn.zucc.day02;

import java.util.Scanner;

public class shopping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("请输入会员积分");
int jifen = sc.nextInt();
if(jifen<2000){
	System.out.println("该会员享受的折扣是0.9");
}
else if(jifen<4000&&jifen>=2000){
	System.out.println("该会员享受的折扣是0.8");
}
else if(jifen<8000&&jifen>=4000){
	System.out.println("该会员享受的折扣是0.7");
}
else{System.out.println("该会员享受的折扣是0.6");}
	}

}
