package cn.zucc.day04;

public class Song {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "�Ұ����й����Ұ�����硣";
		int num = 0 ;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='��'){
				num++;
			}
			
		}
	System.out.println("�����ֵĴ�����"+num);}

}
