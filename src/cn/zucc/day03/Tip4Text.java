package cn.zucc.day03;

public class Tip4Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tip4 tip=new Tip4();
		System.out.println("帖子类的无参构造方法");
	    System.out.println("====帖子信息====");
	    tip.settitle();
	    System.out.println("帖子标题："+tip.getTitle());
	    tip.setcontent();
	    System.out.println("帖子内容："+tip.getContent());
	    tip.setpublishTime();
	    System.out.println("发表时间："+tip.getPublishTime());
	
	   
	}



	}


