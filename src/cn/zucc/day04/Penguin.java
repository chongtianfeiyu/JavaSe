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

		this.sex="Q��";
	}
	public void print(){
		System.out.println(getSex());
	}

	@Override
	public void Cure() {
		// TODO Auto-generated method stub
		System.out.println("��ҩ����Ϣ");
	}

	
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("��Ӿ����ֵ����10���������ܶ�����5");
		super.health1 = super.health1 - 10;
		super.love1 = super.love1 + 5 ;
		System.out.println("ʣ�ཡ��ֵ"+super.health1 +"���ܶ�"+ super.love1);
	} 

}
