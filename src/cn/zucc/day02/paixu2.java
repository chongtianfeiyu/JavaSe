package cn.zucc.day02;

import java.util.Arrays;

public class paixu2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("原字符序列：a c u b e p f z ");
		char [] num ={'a','c','u','b','e','p','f','z'};
		int flag = num.length ;
		Arrays.sort(num);
		for(int i = 0; i<num.length;i++){
			System.out.println(num[i]);
		}
		System.out.println("待插入的字符是:m");
		for(int i =0; i<num.length ;i++){
			
		}
		
	}

}
