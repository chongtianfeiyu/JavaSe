package cn.zucc.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String, String>();
		map.put("С��", "ѩ����");
		map.put("С��","����");
		map.put("С��", "��ʿ��");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������:");
		String name = sc.next();
		if(map.containsKey(name)){
			System.out.println(map.get(name));
		}else{
			System.out.println("erro");
		}
	}

}
