package cn.zucc.day02;

import java.util.Scanner;

public class car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("请输入你的存款");
	int cunKuan = sc.nextInt() ;
	if(cunKuan>500){
		System.out.println("我就买凯迪拉克");
	} 
	else if(cunKuan>100){
		System.out.println("我就买帕萨特");
	}
	else if(cunKuan>50){
		System.out.println("我就买伊兰特");
	}
	else if(cunKuan>10){
		System.out.println("我就买奥拓");
		}
	else{
		System.out.println("我就买捷安特");
	}
	}
}
