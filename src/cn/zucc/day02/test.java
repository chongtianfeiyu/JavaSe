package cn.zucc.day02;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		Administrator ad = new Administrator() ;
		System.out.println("���������֣�");
		ad.name = sc.next();
		ad.show();
	*/	
		/*Scanner sc = new Scanner(System.in);
		Customer ct = new Customer();
		System.out.println("�����뿨���ͣ�");
		ct.cardType = sc.next();
		System.out.println("���������");
		ct.point = sc.nextInt();
		ct.show();
		*/
		Scanner sc = new Scanner(System.in);
		Manager mg = new Manager();
		System.out.println("�������û�����");
		mg.accounts = sc.next();
		System.out.println("���������룺");
		mg.passwords = sc.next();
		String acounts1 ="admins" ;
		String password1 ="111111" ;
		if((mg.accounts.equals(acounts1))&&mg.passwords.equals(password1)){
			System.out.println("��½�ɹ�");
		}
		else{
			System.out.println("�����˺���������");
			
		}
		int flag = 0 ;
		while(flag==0){
			System.out.println("�����������룺");
			int password3 = sc.nextInt();
			System.out.println("���ٴ�����������");
			int password2 = sc.nextInt();
			if(password3==password2){
				flag = 1;
				System.out.println("�޸�����ɹ���������Ϊ��"+password3 );
			}
			else{
				flag = 0;
				System.out.println("��������������벻һ�£�����������");
			}
			
		}
		
	}

}
