package cn.zucc.day03;

import java.util.Scanner;

public class Student22 {
	Student2[] st = new Student2[1000];
	int i = 0;
	public void addSt(Student2 sts){
		st[i] = sts;
		i++;
		
		}
		
	public double average(){
		double sum = 0;
		for(int j =0;j<i;j++){
			sum = sum +st[j].height;
		}
		double avg = sum/i;
		return avg;
	}
		
	}


