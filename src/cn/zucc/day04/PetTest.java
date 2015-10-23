package cn.zucc.day04;

import java.util.Scanner;

public class PetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		Dog dog = new Dog();
		Penguin pg = new Penguin();
	
	   System.out.println("欢迎来到宠物店：");
	   System.out.println("请输入要领养的宠物名字：");
	   String name1 = sc.next();
	   dog.setName(name1);
	   System.out.println("请选择领养的宠物类型：1.狗 2.企鹅");
	   int num = sc.nextInt();
	   switch (num) {
	case 1:
		System.out.println("请选择性别：1.男2.女：");
		
		int sex1 = sc.nextInt();
		if(sex1==1){
			dog.setSex("男");
		}else{
			dog.setSex("女");
		}

		System.out.println("请输入种类：");
        String strain1 = sc.next(); 
        
		dog.setStrain(strain1);
		dog.print();
		
		break;

	case 2:
		System.out.println("我的名字叫:"+name1+"我的健康值是："+pg.getHealth()+"我的亲密度是："+pg.getLove());
		break;
	default:
		break;
	}
	*/	
		
		
	Pet pet = new Penguin();
		Master m = new Master();
		m.Cure(pet);
		m.Play(pet);
		m.Play(pet);
		}

}
