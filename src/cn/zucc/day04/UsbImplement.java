package cn.zucc.day04;

public class UsbImplement implements Usb , Usb1{

	@Override
	public void service() {
		// TODO Auto-generated method stub

		System.out.println("连接USB口，开始传输数据。");
	}

	int usb=1;
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("你是傻逼");
		
	}

}
