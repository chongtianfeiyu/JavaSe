package cn.zucc.day04;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Penguin() {

		this.sex="Q仔";
	}
	public void print(){
		System.out.println(getSex());
	}

	@Override
	public void Cure() {
		// TODO Auto-generated method stub
		System.out.println("吃药，休息");
	}

	
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("游泳健康值减少10与主人亲密度增加5");
		super.health1 = super.health1 - 10;
		super.love1 = super.love1 + 5 ;
		System.out.println("剩余健康值"+super.health1 +"亲密度"+ super.love1);
	} 

}
