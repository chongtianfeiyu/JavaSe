package cn.zucc.day04;

public class UsbImplement implements Usb , Usb1{

	@Override
	public void service() {
		// TODO Auto-generated method stub

		System.out.println("����USB�ڣ���ʼ�������ݡ�");
	}

	int usb=1;
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("����ɵ��");
		
	}

}
