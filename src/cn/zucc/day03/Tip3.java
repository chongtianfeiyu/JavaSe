package cn.zucc.day03;

public class Tip3 {
	private String title ;
	private String content;
	private String publishTime;
	public  Tip3(){
		this.title = "�������֣����Ҷ�ָ��";
		this.content = "�Ҹտ�ʼѧJAVA�����Ҷ�ָ��";
		this.publishTime = "2007-1-1 10��30��16";
	}
	
	public  Tip3(String title,String content, String publishTime){
		this.title =title;
		this.content = content;
		this.publishTime =publishTime;
	}
	public String getTitle(){
		return title;
	}
	
	public String getContent(){
		return content;
	}
	
	
	public String getPublishTime(){
		return publishTime;
	}
	
}

	

