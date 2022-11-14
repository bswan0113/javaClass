package day16;

import java.util.HashSet;

public class SetEx01 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		//객체의 해쉬코드값을 비교하여 중복을 확인


		set.add(28);
		set.add(13);
		set.add(22);
		set.add(22);
		set.add(22);
		set.add(1);
		set.add(22);
		set.add(281);
		set.add(116);
		set.add(155);
		
		System.out.println(set);
	}

}
