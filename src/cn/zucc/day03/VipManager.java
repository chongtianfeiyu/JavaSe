package cn.zucc.day03;

public class VipManager {
	Vip[] vips = new Vip[30];
	int i = 0;

	public void addVip(Vip vip) {
		vips[i] = vip;
		i++;

	}

	public void showVips() {

		System.out.print("编号\t");
		System.out.println("积分");
		for (int j = 0; j < i; j++) {

			Vip vip = vips[j];
			System.out.println(vip.num + "\t" + vip.score);
		}

	}

	public void search(String vip) {
		for (int j = 0; j < i; j++) {

			Vip vip1 = vips[j];
			if (vip1.num.equals(vip)) {
				System.out.println("该会员的积分为：" + vip1.score);
				break;
				
			}

			else{
				System.out.println("没有这个会员");
			}
		}
		
	}
}
