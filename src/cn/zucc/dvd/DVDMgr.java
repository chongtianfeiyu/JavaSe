package cn.zucc.dvd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DVDMgr {


	Scanner sc = new Scanner(System.in);
	ArrayList<DVD> list = new ArrayList<DVD>();
	int flag;

	public void initial() {
		DVD dvd1 = new DVD("罗马假日", 0, "2010-1-1");
		DVD dvd2 = new DVD("风声鹤泣", 1, "");
		DVD dvd3 = new DVD("浪漫满屋", 1, "");
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);

	}

	public void returnMenu() throws ParseException {
		System.out.println("请输入0返回");
		int num = sc.nextInt();
		if (num == 0) {
			mainMenu();
		} else {
			System.out.println("输入错误，请输入正确：");
			returnMenu();
		}
	}

	public void mainMenu() throws ParseException {
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("-----------------------");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退出");
		System.out.print("请选择:");
		int num = sc.nextInt();
		switch (num) {

		case 1:
			add();

			break;

		case 2:
			watch();

			break;
		case 3:

			delete();
			break;

		case 4:

			borrow();
			break;
		case 5:

			returnDVD();
			break;
		case 6:
			System.out.println("谢谢使用");

			break;
		default:
			break;
		}
	}

	public void add() throws ParseException {

		System.out.println("请输入名字");
		String name = sc.next();
		DVD dvd = new DVD(name);
		list.add(dvd);
		System.out.println("新增《" + name + "》成功");
		returnMenu();
	}

	public void watch() throws ParseException {
		for (DVD dvd : list) {
			if (dvd.getState() == 0) {
				System.out.println(dvd.getName() + "\t" + "已借出" + "\t"
						+ dvd.getDate());
			} else {
				System.out.println(dvd.getName() + "\t" + "可借" + "\t"
						+ dvd.getDate());
			}
		}
		returnMenu();
	}

	public void delete() throws ParseException {
		System.out.println("请输入删除DVD的名字");
		String name = sc.next();
		for (DVD dvd : list) {
			if (dvd.getName().equals(name)) {
				if (dvd.getState() == 0) {
					System.out.println("《" + name + "》为借出状态不可删除");
				} else {
					System.out.println("删除成功");
					list.remove(dvd);
					break;
				}

			}

		}

		returnMenu();
	}

	public void borrow() throws ParseException {

		System.out.println("请输入要借出的DVD名字");
		String name = sc.next();
		int flag = 0;
		for (DVD dvd : list) {
			flag = 1;
			if (dvd.getName().equals(name)) {

				if (dvd.getState() == 0) {
					System.out.println("《" + name + "》为借出状态不可借出");
				} else {

					System.out.println("请输入借出日期(年-月-日)");
					System.out.println("借出成功");
					dvd.setState(0);
					String time = sc.next();
					returnMenu();
					break;
				}
			}
			if (flag == 0) {
				System.out.println("你要借出的DVD不存在！");
				returnMenu();

			}

		}
	}

	public void returnDVD() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int i = 0;
		Date StartTime;
		Date EndTime;
		System.out.println("请输入要归还的DVD名字");
		String name = sc.next();
		System.out.println("请输入归还日期（年-月-日）");
		String date = sc.next();
		EndTime = sdf.parse(date);
		for (DVD dvd : list) {
			if (dvd.getName().equals(name)) {
				if (dvd.getState() == 1) {
					System.out.println("《" + name + "》为未借出状态不可归还");
				} else {
					System.out.println("归还成功");
					dvd.setState(1);
					StartTime = sdf.parse(dvd.getDate());
					long day = EndTime.getTime() - StartTime.getTime();
					long money = day / (1000 * 60 * 60 * 24);
					System.out.println("钱" + money);
					break;

				}
			}
		}
		returnMenu();
	}

}
