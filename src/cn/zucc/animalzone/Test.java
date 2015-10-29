package cn.zucc.animalzone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Animal animal1 = new Duck("唐小鸭", 2);
			Animal animal2 = new Cat("加菲猫", 4);
			Animal animal3 = new Dolphin("海豚奇奇");

			System.out.print("动物名字");
			System.out.print("\t\t腿的条数");
			System.out.println("\t\t动物叫");

			Set<Animal> s = new HashSet<Animal>();
			s.add(animal1);
			s.add(animal2);
			s.add(animal3);

			for (Animal animal : s) {
				System.out.print(animal.getName() + "\t\t");
				if (animal instanceof Duck) {
					System.out.print(((Duck)animal).getLegNum()+"\t\t");
				} else if (animal instanceof Cat) {
					System.out.print(((Cat)animal).getLegNum()+"\t\t");
				} else {
					System.out.print("0\t\t");
				}
				animal.shout();
			}
		}
}
