package cn.zucc.dvd;

public class DVD {
	 private String name ;
	 private int state;
	 private String date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public DVD(String name, int state) {
		super();
		this.name = name;
		this.state = state;
	}
	public DVD(String name, int state, String date) {
		super();
		this.name = name;
		this.state =state;
		this.date = date;
	}
	public DVD() {
		super();
	}
	public DVD(String name) {
		super();
		this.name = name;
		state = 1;
	}
	 
}
