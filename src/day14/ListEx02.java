package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(0,10);
		list.remove(1); //remove(n) n번지 삭제
		list.remove((Integer)10); //remove((class)n); n삭제

		
		System.out.println(list);
		System.out.println("1이 있습니까" + list.contains(1));
		System.out.println("1이 어디에 있습니까 " + list.indexOf(1)+ " 요기에 있습니다.");
		System.out.println("1번지에 머가 있어영" + list.get(1));
		
		for(int i=0; i<20;i++) {
			list.add(i);
		}
		
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		
		
System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
					System.out.print(tmp + " ");
		}
	}

}
