package cn.zucc.day03;

public class Tip {

	private String title ;
	private String content;
	private String publishTime;
	public  Tip(){
		this.title = "我是新手，请大家多指教";
		this.content = "我刚开始学JAVA，请大家多指教";
		this.publishTime = "2007-1-1 10：30：16";
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
