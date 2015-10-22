package cn.zucc.day04;

public abstract class Pet {
	private String name;
	private int health = 100;
	private int love = 20;

	public abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setType(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public abstract void Cure();

	int health1 = 100;
	int love1 = 20 ;
}
