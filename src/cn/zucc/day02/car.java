package cn.zucc.day02;

import java.util.Scanner;

public class car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("��������Ĵ��");
	int cunKuan = sc.nextInt() ;
	if(cunKuan>500){
		System.out.println("�Ҿ��򿭵�����");
	} 
	else if(cunKuan>100){
		System.out.println("�Ҿ���������");
	}
	else if(cunKuan>50){
		System.out.println("�Ҿ���������");
	}
	else if(cunKuan>10){
		System.out.println("�Ҿ������");
		}
	else{
		System.out.println("�Ҿ���ݰ���");
	}
	}
}
