package cn.zucc.day03;

public class Tip2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board bd = new Board();
		User us = new User();
		System.out.println("版块名称：" + bd.getBoardName());
		System.out.println("用户名：" + us.getUName());
		System.out.println("用户密码：" + us.getUPass());
		System.out.println("性别：" + us.getUId());

	}
	

}
