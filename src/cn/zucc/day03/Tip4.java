package cn.zucc.day03;

public class Tip4 {
	private String title ;
	private String content;
	private String publishTime;
	public void settitle() {
		this.title="Java板块测试贴1";
	}

	public void setcontent() {
		this.content="你看不见我，你看不见我，你真的看不见我；";
	}

	public void setpublishTime() {
		this.publishTime="2015年10月21日18:44:21";
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



