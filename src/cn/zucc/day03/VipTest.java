package cn.zucc.day03;

import java.util.Scanner;

public class VipTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String flag;
		
		do {
			Vip vip = new Vip();
			System.out.println("输入会员编号：");
			String num = sc.next();
			System.out.println("输入会员积分:");
			int score= sc.nextInt();
			vip.num = num ;
			vip.score = score ;
			vm.addVip(vip);
			System.out.println("是否继续输入(y/n?)");
			flag = sc.next();
		} while (flag.equals("y"));
		vm.showVips();
		System.out.println("请输入要查找的客户编号：");
		String num1= sc.next();
		vm.search(num1);

		
		
	}
	

}
