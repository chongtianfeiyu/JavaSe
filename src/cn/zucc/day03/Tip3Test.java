package cn.zucc.day03;

public class Tip3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tip3 tp = new Tip3();
		System.out.println("���ӵı��⣺"+tp.getTitle());
		System.out.println("��������:" + tp.getContent());
		System.out.println("����ʱ��:" + tp.getPublishTime());
		
		
		Tip3 tp1 = new Tip3("һ�������java����","HelloAccp","2010-1-1 00:00:00");
		
		System.out.println("���ӱ���" + tp1.getTitle());
		System.out.println("��������" + tp1.getContent());
		System.out.println("����ʱ��" + tp1.getPublishTime());
		
		
		
		
		
	}

}
