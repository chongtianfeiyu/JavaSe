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
		map.put("小红", "雪纳瑞");
		map.put("小白","博美");
		map.put("小黑", "哈士奇");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入宠物的名字:");
		String name = sc.next();
		if(map.containsKey(name)){
			System.out.println(map.get(name));
		}else{
			System.out.println("erro");
		}
	}

}
