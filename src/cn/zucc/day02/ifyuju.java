package cn.zucc.day02;

import java.util.Scanner;

public class ifyuju {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("输入学号");
int xuehao = sc.nextInt() ;
int suijishu = 7 ;
if(((xuehao/100)%10)==7){
	System.out.println("你是幸运会员奖励MP3");
	
}
else{
	System.out.println("谢谢参与");
}
	}

}
