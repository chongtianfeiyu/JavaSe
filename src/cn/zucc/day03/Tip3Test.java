package cn.zucc.day03;

public class Tip3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tip3 tp = new Tip3();
		System.out.println("帖子的标题："+tp.getTitle());
		System.out.println("帖子内容:" + tp.getContent());
		System.out.println("发表时间:" + tp.getPublishTime());
		
		
		Tip3 tp1 = new Tip3("一个经典的java程序","HelloAccp","2010-1-1 00:00:00");
		
		System.out.println("帖子标题" + tp1.getTitle());
		System.out.println("帖子内容" + tp1.getContent());
		System.out.println("发表时间" + tp1.getPublishTime());
		
		
		
		
		
	}

}
