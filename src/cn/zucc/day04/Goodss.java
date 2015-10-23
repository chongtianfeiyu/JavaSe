package cn.zucc.day04;

import java.util.Scanner;

public class Goodss {
	public void login(){
	Scanner sc = new Scanner(System.in);
	int flag=0 ;


	do{
		
	System.out.println("请输入用户名：");
	String account = sc.next();
	System.out.println("请输入密码：");
	String password = sc.next();
	if(account.equals("TOM")&&password.equals("123")){
		System.out.println("登陆成功！");
		flag = 1;
		
	}else{
		System.out.println("用户名或密码错误：");
		flag = 0;
	}
	
	}while(flag==0);
	
	
		 
	        System.out.println("*****************欢迎进入商品批发城*******************");
	        System.out.println("编号 商品  价格");
	        System.out.println("1 电风扇  124.23");
	        System.out.println("2 洗衣机  4,500.00");
	        System.out.println("3 电视机  8,800.9");
	        System.out.println("4 冰箱  5,000.88");
	        System.out.println("5 空调机  4,456.0");
	        System.out.println("******************************************************");
	        System.out.println("请输入您批发的商品编号：");
	        String productNo=sc.next();
	        System.out.println("请输入批发数量：");
	        int num=sc.nextInt();
	        double fee = 0;
	        if (productNo.equals("1")){
	            fee=num*124.23;
	        }else if(productNo.equals("2")){
	            fee=num*4500.0;
	        }else if(productNo.equals("3")){
	            fee=num*8800.9;
	        }else if(productNo.equals("4")){
	            fee=num*5000.88;
	        }else if(productNo.equals("5")){
	            fee=num*4456.0;
	        }
	        
        	

	        System.out.println("你需要付款："+fee);
    
        	String str = fee + "";
        	str.indexOf(".");
    }
	}


