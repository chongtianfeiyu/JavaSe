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
		
		System.out.println("数列中所有数据的和是："+sum);
		System.out.println("输入一个数字：");
		int num1 = sc.nextInt();
		for(int i = 0; i<num.length; i++){
			if(num1==num[i]){
			System.out.println("该数字属于数组");
			}
			else{
				System.out.println("该数字不属数组");break;
			}
			}
			
		}
	
			
		
		                     
	
	}

