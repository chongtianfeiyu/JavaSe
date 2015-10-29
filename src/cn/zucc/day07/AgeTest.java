package cn.zucc.day07;

import java.util.Scanner;

public class AgeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age age = new Age();
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»ÎƒÍ¡‰");
		int num = sc.nextInt();
		try {
			age.SetAge(num);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		

	}

}
