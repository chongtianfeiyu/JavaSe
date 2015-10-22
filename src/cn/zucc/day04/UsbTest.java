package cn.zucc.day04;

public class UsbTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsbImplement ub = new UsbImplement();
		ub.service();
		ub.show();
		System.out.println(ub.usb);

	}

}
