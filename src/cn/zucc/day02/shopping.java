package cn.zucc.day02;

import java.util.Scanner;

public class shopping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("�������Ա����");
int jifen = sc.nextInt();
if(jifen<2000){
	System.out.println("�û�Ա���ܵ��ۿ���0.9");
}
else if(jifen<4000&&jifen>=2000){
	System.out.println("�û�Ա���ܵ��ۿ���0.8");
}
else if(jifen<8000&&jifen>=4000){
	System.out.println("�û�Ա���ܵ��ۿ���0.7");
}
else{System.out.println("�û�Ա���ܵ��ۿ���0.6");}
	}

}
