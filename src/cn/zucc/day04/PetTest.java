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
	
	   System.out.println("��ӭ��������꣺");
	   System.out.println("������Ҫ�����ĳ������֣�");
	   String name1 = sc.next();
	   dog.setName(name1);
	   System.out.println("��ѡ�������ĳ������ͣ�1.�� 2.���");
	   int num = sc.nextInt();
	   switch (num) {
	case 1:
		System.out.println("��ѡ���Ա�1.��2.Ů��");
		
		int sex1 = sc.nextInt();
		if(sex1==1){
			dog.setSex("��");
		}else{
			dog.setSex("Ů");
		}

		System.out.println("���������ࣺ");
        String strain1 = sc.next(); 
        
		dog.setStrain(strain1);
		dog.print();
		
		break;

	case 2:
		System.out.println("�ҵ����ֽ�:"+name1+"�ҵĽ���ֵ�ǣ�"+pg.getHealth()+"�ҵ����ܶ��ǣ�"+pg.getLove());
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
