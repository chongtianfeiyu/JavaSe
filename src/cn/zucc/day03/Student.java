package cn.zucc.day03;

public class Student {

		String[] name1 = new String[5];
		int i = 0;

		public void addName(String name) {
			name1[i] = name;
			i++;
		}

		public void showName() {
		
			System.out.println("\t本班学生列表");
		
			for (int j = 0; j < i; j++) {

				
				System.out.print(name1[j]+ " ");
			}

		}
		
		public boolean search(String name2 ,String name3) {
			for (int j = 0; j < i; j++) {

				if (name1[j].equals(name2)) {
					name1[j]=name3 ;
					System.out.println("修改成功");
					return true;
				}

			}
			return false;
		}
}
