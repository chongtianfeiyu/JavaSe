package cn.zucc.animalzone;

public class Cat extends Animal implements Leg {
	private int legNum;

	public Cat(String name, int legNum) {
		super();
		super.setName(name);
		this.legNum = legNum;
	}

	public int getLegNum() {
		return legNum;
	}


	public void shout() {
		System.out.println("ίχίχίχίχ~");
	}

}
