package cn.zucc.day02;

import java.util.Scanner;

public class buke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ; 
		System.out.println("���������ѽ��");
		int money = sc.nextInt() ;
		System.out.println("�Ƿ�μӻ������");
		System.out.println("1����50����2Ԫ�������¿�������һƿ");
		System.out.println("2����100����3Ԫ����500ml����һƿ");
		System.out.println("3����100����10Ԫ����5�������");
		System.out.println("4����200����10Ԫ����1���ղ������˹�");
		System.out.println("5����200����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
		System.out.println("0:������");
		System.out.println("��ѡ��");
		int shuzi = sc.nextInt();
		int money1 ;
		switch (shuzi) {
		case 1:
			if(money>=50){
			money1 = money + 2 ;
			System.out.println("���������ܽ�" + money1);
			System.out.println("�ɹ����������¿�������");
			}
			else{
				System.out.println("�������ɹ�");
			}
			break;

		case 2 :
			if(money>=100){
			money1 = money + 3 ;
			System.out.println("���������ܽ�" + money1);
			System.out.println("�ɹ�������500ml����");
			}
			else{
				System.out.println("�������ɹ�");
			}
			break;
		case 3 :
			if(money>=100){
				money1 = money + 10 ;
				System.out.println("���������ܽ�" + money1);
				System.out.println("�ɹ�������5�������");
				}
				else{
					System.out.println("�������ɹ�");
				}
			break ;
		case 4 :
			if(money>=200){
				money1 = money + 10 ;
				System.out.println("���������ܽ�" + money1);
				System.out.println("�ɹ��������ղ������˹�");
				}
				else{
					System.out.println("�������ɹ�");
				}
			break ;
		case 5 :
			if(money>=100){
				money1 = money + 20 ;
				System.out.println("���������ܽ�" + money1);
				System.out.println("�ɹ�������������ˬ��ˮ");
				}
				else{
					System.out.println("�������ɹ�");
				}
			break ;
			
		default:
			break;
		}
	}

}
