package cn.zucc.day02;

import java.util.Arrays;
import java.util.Scanner;

public class paixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("�����������ɼ���");
		Scanner sc = new Scanner(System.in) ;
		int score = sc.nextInt();
		
		int [] num ={99,85,82,63,60};
		int [] score1 = new int[6];
		int flag = num.length ;
		for(int i=0;i<num.length;i++){
			if(score>num[i]){
				flag=i;
				score1[flag] = score ; break ;
			}
			else{
				score1[i]=num[i];
			}
			System.out.println("����ɼ����±��ǣ�" + flag);
		}
		System.out.println("�����ĳɼ���Ϣ�ǣ�");
		 if(flag==5){score1[6]=score;}
		   else;
		     for(int j=flag+1;j<=num.length;j++)
		     {
		    	 score1[j]=num[j-1]; 	 
		     }
		     for(int k=0;k<score1.length;k++)
		     {
		    	 System.out.print(score1[k]+"\t");
		     }

		
		
		}
		
		
		
		
	}


