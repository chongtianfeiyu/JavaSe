package cn.zucc.day01;

import java.util.Scanner;

public class kaoshi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--欢迎来到文达教育--");
System.out.println("文达课程服务：");
System.out.println("Java软件工程师培训费用。\t（学费20RMB）");
System.out.println("Andriod手机开发培训。\t（学费30RMB）");
System.out.println("淘宝开店营销培训。\t（学费10RMB）");
System.out.println("嵌入式工程师培训。\t（学费30RMB）");
Scanner sc=new Scanner(System.in);		
System.out.println("请输入参加java软件工程师培训的学员人数：");		
int theNumber1 = sc.nextInt();

System.out.println("请输入参加Andriod手机开发培训的学员人数：");		
int theNumber2 = sc.nextInt();

		
System.out.println("请输入参加淘宝开店营销培训的学员人数：");		
int theNumber3 = sc.nextInt();

		
System.out.println("请输入参加嵌入式工程师培训的学员人数：");		
int theNumber4 = sc.nextInt();

System.out.println("！！！你享受的折扣是8折优惠")	;
double theNumber5 = 20*theNumber1 + 30*theNumber2 + 10*theNumber3 + 30*theNumber4 ;
System.out.println("您打折前支付的总学费：" + theNumber5);
double theNumber6 =0.8*theNumber5;
System.out.println("折后你应该支付的学费：" + theNumber6);
System.out.println("请支付");
int theNumber7=sc.nextInt();

double theNumber8=theNumber7 - theNumber6 ;

System.out.println("找零:" + theNumber8);

System.out.println("您获得的积分：4");
System.out.println("祝您学习生活愉快");
	}

}
