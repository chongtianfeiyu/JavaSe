package cn.zucc.day07;

public class Age {
	public void SetAge(int num) throws Exception{
		if(num<100&&num>1){
			System.out.println("������" + num);
		}else{
			throw new Exception("�������1-100֮��");
		}
	}

}
