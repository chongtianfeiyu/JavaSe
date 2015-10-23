package cn.zucc.day05;

import java.util.ArrayList;
import java.util.List;

public class PenguinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Penguin pen1 = new Penguin("小白","帝企鹅");
		Penguin pen2 = new Penguin("小黑","帝企鹅");
		Penguin pen3 = new Penguin("小绿","帝企鹅");
		Penguin pen4 = new Penguin("小红","帝企鹅");
		List<Penguin> list = new ArrayList<Penguin>();
		list.add(pen1);
		list.add(pen2);
		list.add(pen3);
		list.add(pen4);
		for(int i =0;i<list.size();i++ ){
			Penguin pg = list.get(i);
			System.out.println(pg.getName() + "\t" + pg.getStrain());
		}
		
	}

}
