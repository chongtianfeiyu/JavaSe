package cn.zucc.day04;

public class Dog extends Pet {

	
	
	private String strain;

	private String sex;
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void print(){
		System.out.println("我的名字叫:"+super.getName()+"我的健康值是："+super.getHealth()+"我的亲密度是："+super.getLove()+"我的种类是"+getStrain()
				+"我的性别是:"+getSex());
	}
	public Dog() {
		super();
	}

	public void Cure() {
		// TODO Auto-generated method stub
		System.out.println("打针，吃药");
		
	}
	

	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("主人和狗狗玩接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5");
	}
	
}
