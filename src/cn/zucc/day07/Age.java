package cn.zucc.day07;

public class Age {
	public void SetAge(int num) throws Exception{
		if(num<100&&num>1){
			System.out.println("年龄是" + num);
		}else{
			throw new Exception("年龄必须1-100之间");
		}
	}

}
