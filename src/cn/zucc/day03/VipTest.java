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
			System.out.println("�����Ա��ţ�");
			String num = sc.next();
			System.out.println("�����Ա����:");
			int score= sc.nextInt();
			vip.num = num ;
			vip.score = score ;
			vm.addVip(vip);
			System.out.println("�Ƿ��������(y/n?)");
			flag = sc.next();
		} while (flag.equals("y"));
		vm.showVips();
		System.out.println("������Ҫ���ҵĿͻ���ţ�");
		String num1= sc.next();
		vm.search(num1);

		
		
	}
	

}
