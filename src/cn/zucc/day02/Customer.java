package cn.zucc.day02;

public class Customer {

	int point ;
	String cardType ;
	public void show(){
		System.out.println("该客户卡的类型是：" + cardType +",该客户积分剩余：" + point);
	}
}
