package cn.zucc.day02;

import java.util.Scanner;

public class arrysdemo {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		int [] num = {8,4,2,1,23,344,12};
		int sum = 0;
		int flag = 0;
		for(int i = 0; i<num.length; i++){
			System.out.println(num[i]+"\t");
			
			sum = sum + num[i];
			
			
		}
		
		System.out.println("�������������ݵĺ��ǣ�"+sum);
		System.out.println("����һ�����֣�");
		int num1 = sc.nextInt();
		for(int i = 0; i<num.length; i++){
			if(num1==num[i]){
			System.out.println("��������������");
			}
			else{
				System.out.println("�����ֲ�������");break;
			}
			}
			
		}
	
			
		
		                     
	
	}

