package cn.zucc.day06;

import java.util.Set;

import cn.zucc.day06.MyMap.MyEntry;



public class MyMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap myMap = new MyMap();
		MyMap.MyEntry myEntry = myMap.new MyEntry();
		MyMap.MyEntry myEntry1 = myMap.new MyEntry();
		myEntry.setKey("CN");
		myEntry.setValue("中国");
		myEntry1.setKey("US");
		myEntry1.setValue("美国");
		Set<MyEntry> entrySet = myMap.entrySet;
	

	}

}
