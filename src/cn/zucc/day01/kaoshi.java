package cn.zucc.day01;

import java.util.Scanner;

public class kaoshi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--��ӭ�����Ĵ����--");
System.out.println("�Ĵ�γ̷���");
System.out.println("Java�������ʦ��ѵ���á�\t��ѧ��20RMB��");
System.out.println("Andriod�ֻ�������ѵ��\t��ѧ��30RMB��");
System.out.println("�Ա�����Ӫ����ѵ��\t��ѧ��10RMB��");
System.out.println("Ƕ��ʽ����ʦ��ѵ��\t��ѧ��30RMB��");
Scanner sc=new Scanner(System.in);		
System.out.println("������μ�java�������ʦ��ѵ��ѧԱ������");		
int theNumber1 = sc.nextInt();

System.out.println("������μ�Andriod�ֻ�������ѵ��ѧԱ������");		
int theNumber2 = sc.nextInt();

		
System.out.println("������μ��Ա�����Ӫ����ѵ��ѧԱ������");		
int theNumber3 = sc.nextInt();

		
System.out.println("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");		
int theNumber4 = sc.nextInt();

System.out.println("�����������ܵ��ۿ���8���Ż�")	;
double theNumber5 = 20*theNumber1 + 30*theNumber2 + 10*theNumber3 + 30*theNumber4 ;
System.out.println("������ǰ֧������ѧ�ѣ�" + theNumber5);
double theNumber6 =0.8*theNumber5;
System.out.println("�ۺ���Ӧ��֧����ѧ�ѣ�" + theNumber6);
System.out.println("��֧��");
int theNumber7=sc.nextInt();

double theNumber8=theNumber7 - theNumber6 ;

System.out.println("����:" + theNumber8);

System.out.println("����õĻ��֣�4");
System.out.println("ף��ѧϰ�������");
	}

}
