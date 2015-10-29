package cn.zucc.day08;

public class Student {
	private String name ;
	private int Scode ;
	private String Address;
	private String Email;
	private String Grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScode() {
		return Scode;
	}
	public void setScode(int scode) {
		Scode = scode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Student [Address=" + Address + ", Email=" + Email + ", Grade="
				+ Grade + ", Scode=" + Scode + ", name=" + name + "]";
	}
	

}
