package cn.zucc.day04;

import java.util.Scanner;

public class Goodss {
	public void login(){
	Scanner sc = new Scanner(System.in);
	int flag=0 ;


	do{
		
	System.out.println("�������û�����");
	String account = sc.next();
	System.out.println("���������룺");
	String password = sc.next();
	if(account.equals("TOM")&&password.equals("123")){
		System.out.println("��½�ɹ���");
		flag = 1;
		
	}else{
		System.out.println("�û������������");
		flag = 0;
	}
	
	}while(flag==0);
	
	
		 
	        System.out.println("*****************��ӭ������Ʒ������*******************");
	        System.out.println("��� ��Ʒ  �۸�");
	        System.out.println("1 �����  124.23");
	        System.out.println("2 ϴ�»�  4,500.00");
	        System.out.println("3 ���ӻ�  8,800.9");
	        System.out.println("4 ����  5,000.88");
	        System.out.println("5 �յ���  4,456.0");
	        System.out.println("******************************************************");
	        System.out.println("����������������Ʒ��ţ�");
	        String productNo=sc.next();
	        System.out.println("����������������");
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
	        
        	

	        System.out.println("����Ҫ���"+fee);
    
        	String str = fee + "";
        	str.indexOf(".");
    }
	}


