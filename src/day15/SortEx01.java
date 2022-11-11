package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortEx01 {
	
	public static void main(String[] Ouchs) {
	
	ArrayList<String> list = new ArrayList<String>();

	list.add("감자");
	list.add("김씨");
	list.add("겨자");
	list.add("황야");
	list.add("초콜리");
	list.add("격정");
	System.out.println(list);
	Collections.sort(list);
	
System.out.println(list);
//Comparator 인터페이스를 구현한 구현 클래스가 필요
	Collections.sort(list, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			return -o1.compareTo(o2);
		}
	});
	System.out.println(list); 
	
}
}
