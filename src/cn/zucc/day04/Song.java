package cn.zucc.day04;

public class Song {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "我爱你中国，我爱你故乡。";
		int num = 0 ;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='爱'){
				num++;
			}
			
		}
	System.out.println("爱出现的次数："+num);}

}
