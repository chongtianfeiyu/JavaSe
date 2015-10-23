package cn.zucc.day05;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class DogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Dog> list = new LinkedList<Dog>();
		
		
		String flag;
		do {
			Dog dog = new Dog();
			System.out.println("请输入狗的名字");
			dog.setName(sc.next());
			System.out.println("请输入狗的品种");
			dog.setStrain(sc.next());
			System.out.println("是否继续输入y/n");
			flag = sc.next();
			list.add(dog);
		} while ("y".equals(flag));
		
		System.out.println("请输入第1条狗的名字");
		Dog dog1 = new Dog();
		dog1.setName(sc.next());
		System.out.println("请输入第1条狗的品种");
		dog1.setStrain(sc.next());
		list.addFirst(dog1);
		System.out.println("请输入第2条狗的名字");
		Dog dog2 = new Dog();
		dog2.setName(sc.next());
		System.out.println("请输入第2条狗的品种");
		dog2.setStrain(sc.next());
		list.addLast(dog2);
		/*for(int i=0;i<list.size();i++){
			Dog dg = list.get(i);
			System.out.println(dg.getName()+ "\t" +dg.getStrain());
		}两种for的方法都可以*/
		for(Dog dog :list){
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		
		
		
		

	}

}
