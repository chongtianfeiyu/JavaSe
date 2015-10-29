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
		map.put("CN", "中国");
		map.put("US","美国");
		map.put("JP", "小日本");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入英文");
		String enName = sc.next();
		System.out.println("对应的国家是：" + map.get(enName));
		System.out.println("Map中共有" +map.size() + "组数据");
		System.out.println("请输入要查找的英文：");
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
