package cn.zucc.day02;

import java.util.Scanner;

public class shopping2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("�������Ƿ��ǻ�Ա����(y)/��(n)");
String huiyuan = sc.next();
System.out.println("�����빺����");
int money = sc.nextInt();
if(huiyuan.equals("n")){
	if(money<100){
		System.out.println("ʵ��֧����" + money);
	}
	else{
	double money1 = money*0.9 ;
	System.out.println("ʵ��֧��" + money1);
	}
	
}
else if(huiyuan.equals("y")){
	if(money<200){
	double money2 = money * 0.8 ;
	}
	else{
		double money3 = money*0.75 ;
		System.out.println("ʵ��֧��" + money3);}
}
	}

}
