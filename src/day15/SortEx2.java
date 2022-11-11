package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortEx2 {
	
	public static void main(String[] Ouchs) {
	
	ArrayList<Integer> list = new ArrayList<Integer>();

	list.add(5);
	list.add(7);
	list.add(1);
	list.add(4);
	list.add(11);
	list.add(16);
	list.add(72);
	list.add(172);
	list.add(132);
	list.add(11);
	list.add(9);
	System.out.println(list);
	Collections.sort(list);
	
System.out.println(list);
//Comparator 인터페이스를 구현한 구현 클래스가 필요
	Collections.sort(list, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
	});
	System.out.println(list); 
	
}
}
