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
		System.out.println("�ҵ����ֽ�:"+super.getName()+"�ҵĽ���ֵ�ǣ�"+super.getHealth()+"�ҵ����ܶ��ǣ�"+super.getLove()+"�ҵ�������"+getStrain()
				+"�ҵ��Ա���:"+getSex());
	}
	public Dog() {
		super();
	}

	public void Cure() {
		// TODO Auto-generated method stub
		System.out.println("���룬��ҩ");
		
	}
	

	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("���˺͹�����ӷ�����Ϸ����������ֵ����10�����������ܶ�����5");
	}
	
}
