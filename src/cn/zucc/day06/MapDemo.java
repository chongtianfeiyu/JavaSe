package cn.zucc.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String, String>();
		map.put("CN", "�й�");
		map.put("US","����");
		map.put("JP", "С�ձ�");
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ӣ��");
		String enName = sc.next();
		System.out.println("��Ӧ�Ĺ����ǣ�" + map.get(enName));
		System.out.println("Map�й���" +map.size() + "������");
		System.out.println("������Ҫ���ҵ�Ӣ�ģ�");
		String enName1 = sc.next();
		if(map.containsKey(enName1)){
			System.out.println(map.containsKey(enName1));
		}else{
			System.out.println(map.containsKey(enName1));
		}
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
	}

}
