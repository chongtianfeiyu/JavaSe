package cn.zucc.day02;

import java.util.Scanner;

public class ScoreCacl {
	Scanner sc = new Scanner(System.in) ;
	public void cal(){
		System.out.println("������JAVA�ɼ���");
		int javaScore = sc.nextInt();
		System.out.println("������C#�ɼ���");
		int c = sc.nextInt();
		System.out.println("������DB�ɼ���");
		int DB = sc.nextInt();
		int sum ;
		sum = javaScore + c + DB ;
		System.out.println("�ܳɼ��ǣ�"+sum);
		int ave ;
		ave = sum/3 ;
		System.out.println("ƽ�����ǣ�"+ave);
	}

}
