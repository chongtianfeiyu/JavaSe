package cn.zucc.day01;

import java.util.Scanner;

public class chengji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("����Java�γ̵ĳɼ��ǣ�");
int javaScore = sc.nextInt() ; 
System.out.println("����Sql�γ̵ĳɼ��ǣ�");
int sqlScore = sc.nextInt() ; 
System.out.println("��������ſγ̵ĳɼ��ǣ�");
int lastScore = sc.nextInt() ;
double average = (javaScore + sqlScore + lastScore )/3 ;
System.out.println("���ſγ̵�ƽ�����ǣ�" + average);
double cha = javaScore - sqlScore ;
System.out.println("java�γ̺�sql�γ�֮���ǣ�" + cha);	
		
		
		
		
		
		
	}

}
