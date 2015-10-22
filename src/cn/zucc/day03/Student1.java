package cn.zucc.day03;

public class Student1 {

	String[] name1 = new String[500];
	int i = 0;

	public void addName(String name) {
		name1[i] = name;
		i++;
	}

	public void showName() {

		System.out.println("\t本班学生列表");

		for (int j = 0; j < i; j++) {

			System.out.print(name1[j] + " ");
		}

	}
	public boolean search(int first ,int second,String name2 ) {
		for(int j =first-1; j<second;j++){
			if(name1[j].equals(name2)){
				return true;
			}
		}
		return false;
	}

}
