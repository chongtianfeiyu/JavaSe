package cn.zucc.animalzone;

public class Duck extends Animal implements Leg {
	private int legNum;

	public Duck(String name, int legNum) {
		super();
		super.setName(name);
		this.legNum = legNum;
	}

	public void shout() {
		System.out.println("�¸¸¸�~");
	}


	public int getLegNum() {
		
		return legNum;
	}

	
}
