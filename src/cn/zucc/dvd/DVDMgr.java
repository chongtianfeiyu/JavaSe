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
		DVD dvd1 = new DVD("�������", 0, "2010-1-1");
		DVD dvd2 = new DVD("��������", 1, "");
		DVD dvd3 = new DVD("��������", 1, "");
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);

	}

	public void returnMenu() throws ParseException {
		System.out.println("������0����");
		int num = sc.nextInt();
		if (num == 0) {
			mainMenu();
		} else {
			System.out.println("���������������ȷ��");
			returnMenu();
		}
	}

	public void mainMenu() throws ParseException {
		System.out.println("��ӭʹ������DVD������");
		System.out.println("-----------------------");
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("6.�˳�");
		System.out.print("��ѡ��:");
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
			System.out.println("ллʹ��");

			break;
		default:
			break;
		}
	}

	public void add() throws ParseException {

		System.out.println("����������");
		String name = sc.next();
		DVD dvd = new DVD(name);
		list.add(dvd);
		System.out.println("������" + name + "���ɹ�");
		returnMenu();
	}

	public void watch() throws ParseException {
		for (DVD dvd : list) {
			if (dvd.getState() == 0) {
				System.out.println(dvd.getName() + "\t" + "�ѽ��" + "\t"
						+ dvd.getDate());
			} else {
				System.out.println(dvd.getName() + "\t" + "�ɽ�" + "\t"
						+ dvd.getDate());
			}
		}
		returnMenu();
	}

	public void delete() throws ParseException {
		System.out.println("������ɾ��DVD������");
		String name = sc.next();
		for (DVD dvd : list) {
			if (dvd.getName().equals(name)) {
				if (dvd.getState() == 0) {
					System.out.println("��" + name + "��Ϊ���״̬����ɾ��");
				} else {
					System.out.println("ɾ���ɹ�");
					list.remove(dvd);
					break;
				}

			}

		}

		returnMenu();
	}

	public void borrow() throws ParseException {

		System.out.println("������Ҫ�����DVD����");
		String name = sc.next();
		int flag = 0;
		for (DVD dvd : list) {
			flag = 1;
			if (dvd.getName().equals(name)) {

				if (dvd.getState() == 0) {
					System.out.println("��" + name + "��Ϊ���״̬���ɽ��");
				} else {

					System.out.println("������������(��-��-��)");
					System.out.println("����ɹ�");
					dvd.setState(0);
					String time = sc.next();
					returnMenu();
					break;
				}
			}
			if (flag == 0) {
				System.out.println("��Ҫ�����DVD�����ڣ�");
				returnMenu();

			}

		}
	}

	public void returnDVD() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int i = 0;
		Date StartTime;
		Date EndTime;
		System.out.println("������Ҫ�黹��DVD����");
		String name = sc.next();
		System.out.println("������黹���ڣ���-��-�գ�");
		String date = sc.next();
		EndTime = sdf.parse(date);
		for (DVD dvd : list) {
			if (dvd.getName().equals(name)) {
				if (dvd.getState() == 1) {
					System.out.println("��" + name + "��Ϊδ���״̬���ɹ黹");
				} else {
					System.out.println("�黹�ɹ�");
					dvd.setState(1);
					StartTime = sdf.parse(dvd.getDate());
					long day = EndTime.getTime() - StartTime.getTime();
					long money = day / (1000 * 60 * 60 * 24);
					System.out.println("Ǯ" + money);
					break;

				}
			}
		}
		returnMenu();
	}

}
